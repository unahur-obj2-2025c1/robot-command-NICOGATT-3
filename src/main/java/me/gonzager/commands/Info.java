package me.gonzager.commands;


import java.util.List;
import java.util.stream.Collectors;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Info extends Tarea {

    public Info(Habitacion habitacion, Integer duracion) {
        super(habitacion, duracion);
    }

    @Override
    public void execute(Robot robot) {
        Integer promedioDeLasTareas = this.promedioTareas(robot);
        this.consumirBateria(robot);
        robot.agregarTarea(this);
        System.out.println(promedioDeLasTareas);
    }

    @Override
    public void consumirBateria(Robot robot) {
        robot.disminuirBateria(0.1);
    }

    @Override
    public void duracionDeLaTarea(Robot robot) {
        this.setDuracion(15);
    }

    private Integer promedioTareas(Robot robot) {
        List<Tarea> tareasFiltradas = robot.getTareasEjecutadas().stream().filter(tarea -> !(tarea instanceof Info)).collect(Collectors.toList());
        if(tareasFiltradas.isEmpty()) return 0; 
        Integer suma = tareasFiltradas.stream().mapToInt(tarea -> tarea.getDuracion()).sum(); 
        return suma / tareasFiltradas.size();
    }


}
