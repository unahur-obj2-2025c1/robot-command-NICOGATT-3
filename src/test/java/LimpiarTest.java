
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.Limpiar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class LimpiarTest {
    private Habitacion cuarto3;
    private Tarea limpiarHabitacion; 
    private Robot robot; 

    @BeforeEach
    void setUp(){
        cuarto3 = new Habitacion(true, false, 5); 
        limpiarHabitacion = new Limpiar(cuarto3, 0);
        robot = new Robot(Arrays.asList(limpiarHabitacion), 100.0); 
    }

    @Test
    void limpiaLaHabitacion3() {
        robot.run();

        assertEquals(900, limpiarHabitacion.getDuracion());
        assertTrue(cuarto3.getLimpio());
        assertEquals(99.75, robot.getNivelDeBateria());
    }
}
