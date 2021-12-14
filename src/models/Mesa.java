package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	protected Baraja baraja;

	// Constructores
	public Mesa() {
		baraja = new Baraja(1, true);
	}
	
	/**
	 * Devuleve la baraja que se usa en la mesa
	 * @return Baraja de la mesa
	 */
	public Baraja getBaraja() {
		return baraja;
	}

	/**
	 * Roba una carta de la baraja
	 * 
	 * @return Carta robada
	 */

	public Carta robarCartaDeBaraja() {

		return baraja.Robar();
	}

	/**
	 * Roba varias cartas de la baraja
	 * 
	 * @param n Numero de cartas a robar
	 * @return Cartas robadas de la baraja
	 */

	public List<Carta> robarVariasCartas(int n) {
		ArrayList<Carta> robadas = new ArrayList<Carta>();

		for (int i = 0; i < n; i++) {
			robadas.add(baraja.Robar());
		}
		return robadas;
	}

	/**
	 * Añade una carta a la baraja
	 * 
	 * @param c Carta a añadir
	 */

	public void addCartaABaraja(Carta c) {

		baraja.lista_cartas.add(c);

	}

}
