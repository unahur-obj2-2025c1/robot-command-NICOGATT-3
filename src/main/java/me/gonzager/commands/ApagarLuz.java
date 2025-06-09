package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class ApagarLuz extends Tarea {

    public ApagarLuz(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        this.consumirBateria(robot);
        if(this.getHabitacion().estaEncendida()){
            this.getHabitacion().apagarLuz();
        }

    }

    @Override
    public void consumirBateria(Robot robot) {
        if(this.getHabitacion().estaEncendida()) {
            robot.disminuirBateria(0.05);
        } else {
            robot.disminuirBateria(0.01);
        }
    }

    @Override
    public void duracionDeLaTarea(Robot robot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
