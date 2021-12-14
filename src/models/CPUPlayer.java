package models;

import java.util.Scanner;

public class CPUPlayer extends AbstractPlayer{
	Scanner s = new Scanner(System.in);
	
	// Constructor
	public CPUPlayer(String nombre, Mesa mesa) {
		super(nombre, mesa);
	}

	/**
	 * La CPU juega al juego del 7 y medio.
	 * @return Puntuacion de la CPU en el juego
	 */
	
	@Override
	public double jugarTurno() {
		Carta carta;
			
			while (puntos <= 6) {
				carta = mesa.robarCartaDeBaraja();
				System.out.println("\nCarta CPU: " + carta);
				puntos += carta.getValor7ymedia();
				System.out.println("Puntucion CPU: " + puntos);
			}
			
			System.out.println("Puntuacion total CPU: " + puntos);

		return puntos;
	}


}
