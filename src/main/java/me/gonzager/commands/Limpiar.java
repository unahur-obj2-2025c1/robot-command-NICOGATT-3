package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {

    public Limpiar(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void consumirBateria(Robot robot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

}
