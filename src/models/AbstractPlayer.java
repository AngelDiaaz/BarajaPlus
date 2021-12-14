package models;

public abstract class AbstractPlayer {
	
	//Propiedades
	protected String nombre;
	protected double puntos;
	protected Mano mano;
	protected Mesa mesa;
	
	//Constructores
	public AbstractPlayer(String nombre, Mesa mesa) {
		super();
		this.nombre = nombre;
		this.puntos = 0;
		this.mano = new Mano();
		this.mesa = mesa;
	}
	
	// Getters y setters

	public String getNombre() {
		return nombre;
	}


	public double getPuntos() {
		return puntos;
	}


	public Mano getMano() {
		return mano;
	}


	public Mesa getMesa() {
		return mesa;
	}

	/**
	 * Llama al metodo jugarTurno de la clase CPUPlayer o HumanPlayer, y juega al juego de las 7 y media
	 * @return
	 */

	public abstract double jugarTurno();
	
	
}
