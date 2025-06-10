package me.gonzager.domain;

public class Habitacion {
    private Boolean luz; 
    private Boolean limpio;  
    private Integer metrosDeLaHabitacion; 

    public Habitacion(Boolean luz, Boolean limpio, Integer metros) {
        this.luz = luz; 
        this.limpio = limpio; 
        this.metrosDeLaHabitacion = metros; 
    }

    public Boolean getLuz() {
        return luz;
    }

    public void setLuz(Boolean luz) {
        this.luz = luz;
    }

    public Boolean getLimpio() {
        return limpio;
    }

    public void setLimpio(Boolean limpio) {
        this.limpio = limpio;
    }

    public Boolean estaEncendida() {
        return luz == true; 
    }

    public void prenderLuz() {
        this.setLuz(true);
    }

    public void apagarLuz() {
        this.setLuz(false);
    }

    public Integer getMetrosDeLaHabitacion() {
        return metrosDeLaHabitacion;
    }

    public void setMetrosDeLaHabitacion(Integer metrosDeLaHabitacion) {
        this.metrosDeLaHabitacion = metrosDeLaHabitacion;
    }
    
    public void limpiarHabitacion() {
        setLimpio(true);
    }
}
