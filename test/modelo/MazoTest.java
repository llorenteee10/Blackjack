package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Mazo.
 */
public class MazoTest {

    @Test
    public void testMazoInicialTiene52Cartas() {
        Mazo mazo = new Mazo();
        assertEquals(52, mazo.cartasRestantes());
    }

    @Test
    public void testRepartirCartaReduceElTamaño() {
        Mazo mazo = new Mazo();
        mazo.repartirCarta();
        assertEquals(51, mazo.cartasRestantes());
    }

    @Test
    public void testRepartirCartaNoDevuelveNull() {
        Mazo mazo = new Mazo();
        Carta carta = mazo.repartirCarta();
        assertNotNull(carta);
    }
}
