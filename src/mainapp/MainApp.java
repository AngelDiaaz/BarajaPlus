package mainapp;

import java.util.Scanner;

import models.AbstractGame;
import models.Mesa;
import models.Sieteymedia;

public class MainApp {
	static Scanner s = new Scanner(System.in);
	static Mesa mesa = new Mesa();

	public static void main(String[] args) throws Exception {
		
		AbstractGame juego = new Sieteymedia(false, mesa, 1); 
		
		// LLamamos al metodo start para iniciar juego
		juego.start();
		
	}

}
