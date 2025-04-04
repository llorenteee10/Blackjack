package modelo;

import java.util.ArrayList;

/**
 * Representa la mano de un jugador en el juego de Blackjack.
 * Contiene las cartas actuales del jugador y métodos para calcular su valor.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Mano {
	private final ArrayList<Carta> cartas;

	/**
	 * Crea una nueva mano vacía.
	 */
	public Mano() {
		cartas = new ArrayList<>();
	}

	/**
	 * Agrega una carta a la mano del jugador.
	 * @param carta La carta que se va a agregar.
	 */
	public void agregarCarta(Carta carta) {
		cartas.add(carta);
	}

	/**
	 * Calcula el valor total de la mano, considerando ases como 1 u 11.
	 * @return El valor total de la mano.
	 */
	public int calcularValor() {
		int valor = 0;
		int ases = 0;

		for (Carta carta : cartas) {
			int val = carta.getValor();
			if (val > 10) {
				val = 10;
			} else if (val == 1) {
				ases++;
				val = 11;
			}
			valor += val;
		}

		while (valor > 21 && ases > 0) {
			valor -= 10;
			ases--;
		}

		return valor;
	}

	/**
	 * Elimina todas las cartas de la mano.
	 */
	public void limpiar() {
		cartas.clear();
	}

	/**
	 * Devuelve una representación textual de la mano.
	 * @return Lista de cartas en forma de texto.
	 */
	@Override
	public String toString() {
		return cartas.toString();
	}
}


