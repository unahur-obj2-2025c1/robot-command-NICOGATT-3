package me.gonzager.ex;

import java.util.Arrays;

import me.gonzager.commands.Cargar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Main {
    public static void main(String[] args) {
        Habitacion cocina = new Habitacion(false, true );
        Tarea carga = new Cargar(cocina, 50); 
        Robot robot = new Robot(Arrays.asList(carga), 60.00); 

        robot.run();

        System.out.println(robot.getNivelDeBateria());
        System.out.println(carga.getDuracion());
    }
}