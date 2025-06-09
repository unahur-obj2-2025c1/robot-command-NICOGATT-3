package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuz extends Tarea {

    public EncenderLuz(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        this.consumirBateria(robot);
        if(!this.getHabitacion().estaEncendida()){
            this.getHabitacion().prenderLuz();
        }
    }

    @Override
    public void consumirBateria(Robot robot) {
        if(this.getHabitacion().estaEncendida()) {
            robot.disminuirBateria(0.01);
        } else {
            robot.disminuirBateria(0.05);
        }
    }

    @Override
    public Integer duracionDeLaTarea() {
        return this.getHabitacion().estaEncendida() ? 15 : 25;
    }

    
    

}
