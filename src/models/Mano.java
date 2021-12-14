package models;

import java.util.Scanner;

public class Mano extends Baraja  {
	Scanner s = new Scanner (System.in);
	
	//Constructor
	public Mano() {
		super();
	}
	
	/**
	 * Muestra todas las cartas que tienes en la mano
	 */
	
	public void listarCartas() {
		for (Carta c : lista_cartas){
			System.out.print(c + " / ");
		}
	}
	
	/**
	 * Lista la mano de cartas y elige una carta de la mano y te la quedas, la carta luego se elimina
	 * @return Carta escogida
	 */
	
	public Carta elegirCarta() {
		listarCartas();
		System.out.println();
		System.out.print("Seleccione carta a elegir: ");
		Carta carta = lista_cartas.get(Integer.parseInt(s.nextLine()));
		lista_cartas.remove(carta);
		return carta;
	}
	
}