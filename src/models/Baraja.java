package models;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

	// Propiedades
	protected ArrayList<Carta> lista_cartas;

	// Constructores

	public Baraja() { //Crea una baraja de 40 cartas en un array list, llamando a la clase carta
		lista_cartas = new ArrayList<Carta>();

		for (int i = 1; i <= 40; i++) {
			lista_cartas.add(new Carta(i));
		}

	}

	public Baraja(int tipobaraja) {
		switch (tipobaraja) {

		case 1: //Si quieres una baraja de 40 cartas
			lista_cartas = new ArrayList<Carta>();
			for (int i = 1; i <= 40; i++) {
				lista_cartas.add(new Carta(i));
			}
			break;

		case 2: //Si quieres una baraja doble de 80 cartas
			lista_cartas = new ArrayList<Carta>();
			for (int j = 0; j < 2; j++) {
				for (int i = 1; i <= 40; i++) {
					lista_cartas.add(new Carta(i));
				}
			}
			break;
		}
	}

	public Baraja(int tipobaraja, boolean barajar) {

		if (barajar == true) {
			switch (tipobaraja) {

			case 1: //Si quieres una baraja de 40 cartas
				lista_cartas = new ArrayList<Carta>();
				for (int i = 1; i <= 40; i++) {
					lista_cartas.add(new Carta(i));
				}
				Barajar();
				break;

			case 2: //Si quieres una baraja doble de 80 cartas
				lista_cartas = new ArrayList<Carta>();
				for (int j = 0; j < 2; j++) {
					for (int i = 1; i <= 40; i++) {
						lista_cartas.add(new Carta(i));
					}
					Barajar();
				}
				break;
			}
		} else {
			System.out.println("La baraja no se ha barajado");
		}
	}

	// Métodos
	
	/**
	 * Baraja las cartas de forma aleatoria dentro de la baraja
	 */

	public void Barajar() {
		
	Collections.shuffle(lista_cartas);

	}

	/**
	 * Corta la baraja en la posicion que tu eligas y pasa todas las cartas hasta la
	 * posicion que hayas elegido al final de la baraja
	 * 
	 * @param posicion Posicion que quieres que corte la baraja
	 */

	public void Cortar(int posicion) {

		for (int i = 0; i < posicion; i++) {
			lista_cartas.add(lista_cartas.get(0));
			lista_cartas.remove(0);
		}

	}

	/**
	 * Roba la primera carta de la baraja
	 * 
	 * @return Carta robada
	 */

	public Carta Robar() {
		Carta a = lista_cartas.get(0);
		lista_cartas.remove(0);

		return a;
	}

	/**
	 * Inserta una carta que tu eligas al final de la baraja
	 * 
	 * @param id_carta Id de la carta que quieres insertar
	 */

	public void InsertaCartaFinal(int id_carta) {
		lista_cartas.add(new Carta(id_carta));
	}

	/**
	 * Inserta una carta que tu eligas al principio de la baraja
	 * 
	 * @param id_carta Id de la carta que quieres insertar
	 */

	public void InsertarCartaPrincipio(int id_carta) {

		lista_cartas.add(0, new Carta(id_carta));

	}

	/**
	 * Inserta una carta que tu eligas al final de la baraja
	 * 
	 * @param c Carta que quieres insertar
	 */

	public void InsertaCartaFinal(Carta c) {
		lista_cartas.add(c);
	}

	/**
	 * Inserta una carta que tu eligas al principio de la baraja
	 * 
	 * @param c Carta que quieres insertar
	 */

	public void InsertaCartaPrincipio(Carta c) {
		lista_cartas.add(0, c);
	}

	/**
	 * Muestra el numero de cartas que quedan en la baraja
	 */

	public void getNumeroCartas() {
		System.out.println(lista_cartas.size());

	}

	/**
	 * Te dice si la bajara esta vacia o no
	 * 
	 * @return False si no esta vacia y true si lo esta
	 */

	public boolean isVacia() {
		if (lista_cartas.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return lista_cartas + " ";
	}

	// toString
}
