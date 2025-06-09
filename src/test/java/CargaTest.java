import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.Cargar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class CargaTest {
    private Tarea tareaCargar; 
    private Robot robot; 
    private Habitacion cocina; 

    @BeforeEach
    void setUp() {
        cocina = new Habitacion(false, true); 
        tareaCargar = new Cargar(cocina, 50); 
        robot = new Robot(Arrays.asList(tareaCargar), 60.0);
    }

    @Test
    void cargamosElRobotEnLaEmpresaLoDejamosBajo() {
        robot.run();

        assertEquals(100.0, robot.getNivelDeBateria());
        assertEquals(1, robot.getTareasEjecutadas().size());
    }
}
