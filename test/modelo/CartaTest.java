package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Carta.
 */
public class CartaTest {

    @Test
    public void testConstructorYGetters() {
        Carta carta = new Carta(5, "corazones");
        assertEquals(5, carta.getValor());
        assertEquals("corazones", carta.getPalo());
    }

    @Test
    public void testToString() {
        Carta carta = new Carta(1, "tréboles");
        assertEquals("1 de tréboles", carta.toString());
    }
}
