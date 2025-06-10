package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuz extends Tarea {

    public EncenderLuz(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        this.duracionDeLaTarea(robot);
        this.consumirBateria(robot);
        if(!this.getHabitacion().estaEncendida()){
            this.getHabitacion().prenderLuz();
        }
        robot.agregarTarea(this);
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
    public void duracionDeLaTarea(Robot robot ) {
        if(this.getHabitacion().estaEncendida())
            setDuracion(25); 
        else 
            setDuracion(90);
    }

	

    
    

}
