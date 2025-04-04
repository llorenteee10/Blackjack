package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase Mano.
 */
public class ManoTest {

    @Test
    public void testAgregarCartaYCalcularValor() {
        Mano mano = new Mano();
        mano.agregarCarta(new Carta(10, "picas"));
        mano.agregarCarta(new Carta(1, "tréboles")); // As → 11
        assertEquals(21, mano.calcularValor());
    }

    @Test
    public void testCalculoValorConAses() {
        Mano mano = new Mano();
        mano.agregarCarta(new Carta(1, "diamantes")); // As
        mano.agregarCarta(new Carta(1, "corazones")); // As
        mano.agregarCarta(new Carta(9, "picas"));
        assertEquals(21, mano.calcularValor()); // 11 + 1 + 9
    }

    @Test
    public void testLimpiarMano() {
        Mano mano = new Mano();
        mano.agregarCarta(new Carta(5, "corazones"));
        mano.limpiar();
        assertEquals(0, mano.calcularValor());
    }
}
