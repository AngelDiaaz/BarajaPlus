package models;

import java.util.ArrayList;

import enums.ModoJuego;

public abstract class AbstractGame {
	protected boolean finished;
	protected ModoJuego modo;
	protected ArrayList<AbstractPlayer> jugador;
	protected Mesa mesa;
	protected int ronda;
	

	public AbstractGame(boolean finished, Mesa mesa, int ronda) {
		super();
		this.finished = finished;
		this.mesa = mesa;
		this.ronda = ronda;
	}

	public abstract void bienvenida(); //Insertar a clase hija clase sieteymedia
	
	public abstract void menuPrincipal();
	
	public abstract AbstractPlayer nextTurno(); //DUDAAAA Como se usa este metodo
	
	public abstract void start();
	
	public void barajar() { 
		mesa.baraja.Barajar();
	}
	
	public void finish() {
		if (finished) {
			mesa.baraja.lista_cartas.clear();
		}
	}
}
