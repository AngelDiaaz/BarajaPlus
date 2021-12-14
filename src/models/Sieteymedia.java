package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieteymedia extends AbstractGame {
	Scanner s = new Scanner(System.in);
	
	//Propiedades
	
	ArrayList<AbstractPlayer> jugadores = new ArrayList<AbstractPlayer>();
	HumanPlayer jugador1, jugador2;
	CPUPlayer cpu;

	// Constructor

	public Sieteymedia(boolean finished, Mesa mesa, int ronda) {
		super(finished, mesa, ronda);
	}
	
	/**
	 * Te muestra un mensaje de bienvenida al juego de las 7 y media
	 */

	@Override
	public void bienvenida() {

		System.out.println("Hola bienvenido al juego de las 7 y media");

	}
	
	/**
	 * Te muestra el menu principal del juego y escoges como quieres jugar
	 */

	@Override
	public void menuPrincipal() {
		String nombre;
		System.out.println("¿Cómo desea jugar?");
		System.out.println("a. Solitario \nb. UnovsCPU \nc. PvP");
		String opc = s.nextLine();
		
		switch (opc) {
		case "a":
			System.out.print("Nombre del jugador: ");
			nombre = s.nextLine();
			jugador1 = new HumanPlayer(nombre, this.mesa);
			jugadores.add(jugador1); // Añade el jugador1 al array list de jugadores
			
			jugador1.jugarTurno(); // LLama al metodo jugar turno y juega al juego de las 7 y medio ese jugador
			System.out.println(jugador1.nombre + " tu puntuacion total es " + jugador1.puntos);
			
			if(jugador1.puntos > 7.5) {
				System.out.println(jugador1.nombre + " te has pasado de 7 y medio");
			} else if(jugador1.puntos == 7.5) {
				System.out.println("7 y mediooooo!!! Felicidades " + jugador1.nombre);
			}

			break;
		case "b":
			System.out.print("Nombre del jugador: ");
			nombre = s.nextLine();
			jugador1 = new HumanPlayer(nombre, this.mesa); // Crea a una jugador 
			jugadores.add(jugador1); // Añade el jugador1 al array list de jugadores
			cpu = new CPUPlayer("cpu", this.mesa); // Crea la CPU
			jugadores.add(cpu); // Añade la CPU al array list de jugadores
			
			System.out.println("Turno de " + jugador1.nombre);
			jugador1.jugarTurno();
			System.out.println();
			System.out.println("Turno de la CPU");
			cpu.jugarTurno();
			
			if(jugador1.puntos == 7.5) {
				System.out.println("7 y mediooooo!!! Felicidades " + jugador1.nombre + " has ganado");
			}else if(cpu.puntos == 7.5) {
				System.out.println("7 y mediooooo!!! Para la CPU has perdido"); 
			}else if(jugador1.puntos > cpu.puntos && jugador1.puntos < 7.5) {
				System.out.println("Felicidades " + jugador1.nombre + " has ganado");
			}else if(jugador1.puntos < cpu.puntos && cpu.puntos < 7.5) {
				System.out.println("Has perdido!!! La CPU ha ganado");
			}else if(jugador1.puntos > 7.5) {
				System.out.println("Has perdido " + jugador1.nombre + "te has pasado de 7 y medio");
			}else if(cpu.puntos > 7.5) {
				System.out.println("Has ganado!!! La CPU se ha pasado de 7 y medio");
			}
			
			
			break;
		case "c":
			String nombre1, nombre2;
			System.out.print("Nombre del primer jugador: ");
			nombre1 = s.nextLine();
			jugador1 = new HumanPlayer(nombre1, this.mesa);
			jugadores.add(jugador1);
			System.out.print("Nombre del segundo jugador: ");
			nombre2 = s.nextLine();
			jugador2 = new HumanPlayer(nombre2, this.mesa); // Crea al jugador2
			jugadores.add(jugador2);
			
			System.out.println("Turno de " + jugador1.nombre);
			jugador1.jugarTurno();
			System.out.println();
			System.out.println("Turno de " + jugador2.nombre);
			jugador2.jugarTurno();
			
			if(jugador1.puntos == 7.5) {
				System.out.println("7 y mediooooo!!! Felicidades " + jugador1.nombre + " has ganado");
			}else if(jugador2.puntos == 7.5) {
				System.out.println("7 y mediooooo!!! Felicidades " + jugador2.nombre + " has ganado"); 
			}else if(jugador1.puntos > jugador2.puntos && jugador1.puntos < 7.5) {
				System.out.println("Felicidades " + jugador1.nombre + " has ganado");
			}else if(jugador1.puntos < jugador2.puntos && jugador2.puntos < 7.5) {
				System.out.println("Felicidades " + jugador2.nombre + " has ganado");
			}else if(jugador1.puntos > 7.5) {
				System.out.println("Felicidades " + jugador2.nombre + " has ganado, " + jugador1.nombre + " se ha pasado de 7 y medio");
			}else if(jugador2.puntos > 7.5) {
				System.out.println("Felicidades " + jugador1.nombre + " has ganado, " + jugador2.nombre + " se ha pasado de 7 y medio");
			}
			
			break;
		}
	}
	
	/**
	 * Cambia de turno a otro jugador
	 */
	
	@Override
	public AbstractPlayer nextTurno() {
		return jugador2;
	}
	
	/**
	 * Incia el juego, barajando la baraja y mostrandote el menu principal del juego
	 */

	@Override
	public void start() {
		bienvenida();
		barajar();
		menuPrincipal();

	}

}
