package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.Tarea;


public class Robot {
    private List<Tarea> tareas; 
    private Double nivelDeBateria; 
    private List<Tarea> tareasEjecutadas = new ArrayList<>();
    
    public Robot(){}

    public Robot(List<Tarea> tareas, Double nivelDeBateria) {
        this.tareas = new ArrayList<>(tareas); 
        this.nivelDeBateria = nivelDeBateria; 
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Double getNivelDeBateria() {
        return nivelDeBateria;
    }

    public void setNivelDeBateria(Double nivelDeBateria) {
        this.nivelDeBateria = nivelDeBateria;
    }

    public void run() {
        tareas.stream().forEach(tarea -> tarea.execute(this));
    }

    public Integer tiempoDeTareas() {
        return tareas.stream().mapToInt(tarea -> tarea.getDuracion()).sum();
    }

    public void cargar(Integer minutos) {
        nivelDeBateria = Math.min(nivelDeBateria + (minutos * 0.8), 100.0);
    }

    public List<Tarea> getTareasEjecutadas() {
        return tareasEjecutadas;
    }

    public void agregarTarea(Tarea tarea){
        tareasEjecutadas.add(tarea);
    }

    public void setTareasEjecutadas(List<Tarea> tareasEjecutadas) {
        this.tareasEjecutadas = tareasEjecutadas;
    }
    
    public void disminuirBateria(Double consumo) {
        nivelDeBateria = Math.max(0, nivelDeBateria - consumo);
    }

    
}
