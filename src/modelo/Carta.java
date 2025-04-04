package modelo;

/**
 * Representa una carta con palo y valor en el juego de Blackjack.
 * @author TuNombre
 * @version 1.0
 */
public class Carta {
	private final int valor;
	private final String palo;

	/**
	 * Crea una nueva carta con un valor y un palo especificados.
	 * @param valor Valor de la carta.
	 * @param palo Palo de la carta (corazones, diamantes, etc).
	 */
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	/**
	 * Obtiene el valor de la carta.
	 * @return Valor numérico de la carta.
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Obtiene el palo de la carta.
	 * @return Palo de la carta.
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Devuelve una representación en texto de la carta.
	 * @return String con el formato "valor de palo".
	 */
	@Override
	public String toString() {
		return valor + " de " + palo;
	}
}
