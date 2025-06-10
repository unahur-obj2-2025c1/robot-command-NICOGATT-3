package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {

    public Limpiar(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        this.duracionDeLaTarea(robot);
        this.getHabitacion().limpiarHabitacion();
        this.consumirBateria(robot);
        robot.agregarTarea(this);
    }

    @Override
    public void consumirBateria(Robot robot) {
        robot.disminuirBateria(0.05 * this.getHabitacion().getMetrosDeLaHabitacion());
    }

    @Override
    public void duracionDeLaTarea(Robot robot) {
        this.setDuracion(180 * this.getHabitacion().getMetrosDeLaHabitacion());
    }

}
