package models;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {
	Scanner s = new Scanner(System.in);
	
	//Constructor
	public HumanPlayer(String nombre, Mesa mesa) {
		super(nombre, mesa);
	}
	
	/**
	 * Un jugador juega al juego del 7 y medio.
	 * @return Puntuacion del jugador en el juego
	 */
	
	@Override
	public double jugarTurno() {

		Carta carta;
		String cont;
		do {
			carta = mesa.robarCartaDeBaraja(); //Roba una carta de la baraja y la guarda en la variable carta
			System.out.println("Carta: " + carta);
			puntos += carta.getValor7ymedia();
			System.out.println("Puntuacion: " + puntos);

			if (puntos <= 7.5) {
				System.out.println("¿Quieres otra carta?");
				cont = s.nextLine();
				if (cont.equalsIgnoreCase("no")) {
					System.out.println("Puntuacion total: " + puntos);
					break;
				}

			} else {
				System.out.println("\nTe has pasado de 7 y medio.\nHas perdido!!!");
				break;
			}
		} while (cont.equalsIgnoreCase("si"));
		
		return puntos;
	}
	
	
}
