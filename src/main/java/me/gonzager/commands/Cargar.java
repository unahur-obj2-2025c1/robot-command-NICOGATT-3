package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    public Cargar(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        robot.cargar(this.getDuracion());
        robot.agregarTarea(this);
    }

    @Override
    public void consumirBateria(Robot robot) {
        robot.disminuirBateria(0.0);
    }
    

}
