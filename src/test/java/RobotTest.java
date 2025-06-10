import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.Cargar;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.Limpiar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class RobotTest {
    private Habitacion cuarto4; 
    private Tarea carga; 
    private Tarea encenderLuz; 
    private Tarea limpiar;
    private List<Tarea> tareasAEjecutar;
    private Robot robot; 

    @BeforeEach
    void setUp() {
        cuarto4 = new Habitacion(false, false,  6); 
        carga = new Cargar(cuarto4, 93); 
        encenderLuz = new EncenderLuz(cuarto4, 0); 
        limpiar = new Limpiar(cuarto4, 0); 
        tareasAEjecutar = new ArrayList<>(Arrays.asList(carga, encenderLuz, limpiar)); 
        robot = new Robot(tareasAEjecutar, 26.0);
    }

    @Test
    void elRobotEjecutaLasTareas() {
        robot.run();

        assertEquals(99.65, robot.getNivelDeBateria());
        assertEquals(3, robot.getTareasEjecutadas().size());
        assertEquals(1263, robot.tiempoDeTareas());
    }

}
