package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    public Cargar(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        this.duracionDeLaTarea(robot);
        robot.cargar(this.getDuracion());
        robot.agregarTarea(this);
    }

    @Override
    public void consumirBateria(Robot robot) {
        robot.disminuirBateria(0.0);
    }

    @Override
    public void duracionDeLaTarea(Robot robot) {
        Double  faltante = 100.0 - robot.getNivelDeBateria(); 
        Integer minutosNesarios = (int)Math.ceil(faltante / 0.8);
        Integer minutosReales = Math.min(this.getDuracion(), minutosNesarios); 
        setDuracion(minutosReales);
    }
    

}
