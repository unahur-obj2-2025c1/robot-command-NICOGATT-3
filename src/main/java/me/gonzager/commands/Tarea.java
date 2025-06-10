package me.gonzager.commands;



import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public abstract class Tarea  {
    private Habitacion habitacion;
    private Integer duracion; 
    
    public Tarea(Habitacion habitacion, Integer duracion) {
        this.habitacion = habitacion; 
        this.duracion = duracion; 
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public abstract void execute(Robot robot);

    public abstract void consumirBateria(Robot robot);

    public abstract void duracionDeLaTarea(Robot robot);

}
