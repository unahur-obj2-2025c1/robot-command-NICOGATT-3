package me.gonzager.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.gonzager.commands.Cargar;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.Info;
import me.gonzager.commands.Limpiar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Main {
    public static void main(String[] args) {
        Habitacion cocina = new Habitacion(false, true, 200 );
        Tarea carga = new Cargar(cocina, 50); 
        Robot robot = new Robot(Arrays.asList(carga), 60.00); 

        robot.run();

        // System.out.println(robot.getNivelDeBateria());
        // System.out.println(carga.getDuracion());

        Habitacion cuarto4 = new Habitacion(false, false,  6); 
        Tarea carga2 = new Cargar(cuarto4, 93); 
        Tarea encenderLuz = new EncenderLuz(cuarto4, 0); 
        Tarea limpiar = new Limpiar(cuarto4, 0); 
        Tarea Info = new Info(cuarto4, 0);
        List<Tarea> tareasAEjecutar = new ArrayList<>(Arrays.asList(carga2, encenderLuz, limpiar, Info)); 
        Robot robot2 = new Robot(tareasAEjecutar, 26.0);

        robot2.run();
    }
}