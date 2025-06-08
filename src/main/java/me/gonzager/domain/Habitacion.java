package me.gonzager.domain;

public class Habitacion {
    private Boolean luz; 
    private Boolean limpio;  

    public Habitacion(Boolean luz, Boolean limpio) {
        this.luz = luz; 
        this.limpio = limpio; 
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
}
