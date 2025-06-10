import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuzTest {
    private Habitacion cuarto2; 
    private Tarea encenderLuz; 
    private Robot robot; 

    @BeforeEach
    void setUp() {
        cuarto2 = new Habitacion(false, true, 100); 
        encenderLuz = new EncenderLuz(cuarto2, 0);
        robot = new Robot(Arrays.asList(encenderLuz), 50.0);
    }

    @Test
    void encendemosLaLuzDelCuarto2() {
        robot.run();

        assertEquals(90, encenderLuz.getDuracion());
        assertTrue(cuarto2.estaEncendida());
        assertEquals(49.95, robot.getNivelDeBateria());
    }

    @Test
    void laLuzYaEstaEncendida() {
        cuarto2.setLuz(true);
        robot.run();

        assertEquals(25, encenderLuz.getDuracion());
        assertEquals(49.99, robot.getNivelDeBateria());
    }
}
