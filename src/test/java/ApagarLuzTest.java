import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.ApagarLuz;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class ApagarLuzTest {
    private Habitacion cuarto1; 
    private Tarea apagarLuz; 
    private Robot robot; 

    @BeforeEach
    void setUp() {
        cuarto1 = new Habitacion(true, true, 120); 
        apagarLuz = new ApagarLuz(cuarto1, 0); 
        robot = new Robot(Arrays.asList(apagarLuz), 100.0); 
    }

    @Test
    void apagamosLaLuzDeLaHabitacion() {
        robot.run();

        assertEquals(90, apagarLuz.getDuracion());
        assertFalse(cuarto1.estaEncendida());
        assertEquals(99.95, robot.getNivelDeBateria());
    }
}
