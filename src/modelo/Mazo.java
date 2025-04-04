package modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Representa un mazo de cartas que se puede barajar y repartir.
 * @author TuNombre
 * @version 1.0
 */
public class Mazo {
	private final ArrayList<Carta> cartas;

	/**
	 * Crea un mazo con 52 cartas estándar.
	 */
	public Mazo() {
		cartas = new ArrayList<>();
		for (int i = 1; i <= 13; i++) {
			cartas.add(new Carta(i, "corazones"));
			cartas.add(new Carta(i, "diamantes"));
			cartas.add(new Carta(i, "tréboles"));
			cartas.add(new Carta(i, "picas"));
		}
		barajar();
	}

	/**
	 * Baraja el mazo de cartas.
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}

	/**
	 * Reparte la primera carta del mazo.
	 * @return La carta superior del mazo.
	 */
	public Carta repartirCarta() {
		return cartas.remove(0);
	}

	/**
	 * Devuelve el número de cartas que quedan en el mazo.
	 * @return Número de cartas restantes.
	 */
	public int cartasRestantes() {
		return cartas.size();
	}

	/**
	 * Devuelve una representación textual del mazo.
	 * @return Lista de cartas en forma de texto.
	 */
	@Override
	public String toString() {
		return cartas.toString();
	}
}
