package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Cargar extends Tarea {
    private Integer duracionReal = 0; 

    public Cargar(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        Double  faltante = 100.0 - robot.getNivelDeBateria(); 
        Integer minutosNesarios = (int)Math.ceil(faltante / 0.8);
        Integer minutosReales = Math.min(this.getDuracion(), minutosNesarios); 
        robot.cargar(minutosReales);
        this.duracionReal = minutosReales * 60;
        robot.agregarTarea(this);
    }

    @Override
    public void consumirBateria(Robot robot) {
        robot.disminuirBateria(0.0);
    }

    @Override
    public Integer duracionDeLaTarea() {
        return duracionReal; 
    }
    

}
