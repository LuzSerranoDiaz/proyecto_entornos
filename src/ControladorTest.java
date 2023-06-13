import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControladorTest {
    /**
     * Esta clase contiene tests para los metodos implementados
     * @author Luz Serrano Díaz
     * @version 1.0
     * @see Libro
     */

    Libro l1 = new Libro(1,"woa",true);
    Libro l2 = new Libro(2,"una",false);
    Libro l3 = new Libro(3,"base",true);
    Libro l4 = new Libro(4,"de",true);
    Libro l5 = new Libro(5,"datos",false);
    Libro l6 = new Libro(6,"hola",true);
    private Libro[] libros = {l1,l2,l3,l4,l5,l6};

    @BeforeAll
    /**
     * Un metodo que indica el inicio de las pruebas
     */
    static void setUpBeforeClass(){
        System.out.println("Inicio pruebas");
    }
    @AfterAll
    /**
     * Un metodo que indica el fin de las pruebas
     */
    static void setUpAfterClass(){
        System.out.println("Final pruebas");
    }
    @Test
    /**
     * El metodo test que comprueba el metodo SolicitudLibros mediante distintas pruebas
     */
    void testSolicitudLibros(){
        System.out.println("Casos de prueba");
        assertEquals(1, Controlador.solicitar_libro(1,libros));
        assertEquals(0, Controlador.solicitar_libro(2,libros));
        assertEquals(-1, Controlador.solicitar_libro(9,libros));
    }
}
