package models;

public class Carta {
	// Propiedades
	private int num;
	private int palo;

	// Getters y setters

	public int getNum() {
		return num;
	}

	public int getPalo() {
		return palo;
	}

	public int getId() {
		return this.num + (this.palo * 10);
	}

	// Contructores

	public Carta(int num, int palo) { //Para la carta con numero y palo definido
		super();
		this.num = num;
		this.palo = palo;
	}

	public Carta(int id) { //Para carta con la id
		if (id % 10 != 0) {
			this.num = (id % 10);
			this.palo = (id / 10);	
		} else { // Si el numero es 10 para que muestre el rey
			this.num = (id % 10) + 10;
			this.palo = (id / 10) - 1; 
		}
	}

	// Metodos
	
	/**
	 * Te dice el numero que tiene la carta
	 * @return Numero de la carta
	 */

	public String getNombreNumero() {
		String nombreNum = null;
		if (this.num == 1) {
			nombreNum = "as";
		} else if (this.num == 2) {
			nombreNum = "dos";
		} else if (this.num == 3) {
			nombreNum = "tres";
		} else if (this.num == 4) {
			nombreNum = "cuatro";
		} else if (this.num == 5) {
			nombreNum = "cinco";
		} else if (this.num == 6) {
			nombreNum = "seis";
		} else if (this.num == 7) {
			nombreNum = "siete";
		} else if (this.num == 8) {
			nombreNum = "sota";
		} else if (this.num == 9) {
			nombreNum = "caballo";
		} else if (this.num == 10) {
			nombreNum = "rey";
		}
		return nombreNum;
	}
	
	/**
	 * Te dice que palo es la carta
	 * @return Palo de la carta
	 */

	public String getNombrePalo() {
		String nombrePalo = null;
		if (this.palo == 0) {
			nombrePalo = "oros";
		} else if (this.palo == 1) {
			nombrePalo = "copas";
		} else if (this.palo == 2) {
			nombrePalo = "espadas";
		} else if (this.palo == 3) {
			nombrePalo = "bastos";
		}
		return nombrePalo;
	}
	
	/**
	 * Te muestra el nombre de la carta, mostrando el numero y el palo que es
	 * @return Nombre de la carta
	 */

	public String getNombreCarta() {
		return getNombreNumero() + " de " + getNombrePalo();
	}
	
	/**
	 * Te dice el valor que tiene el numero de la carta en el juego del Tute
	 * @return Valor de la carta
	 */

	public int getValorTute() {
		int valor = 0;
		if (this.num == 1) {
			valor = 11;
		} else if (this.num == 3) {
			valor = 10;
		} else if (this.num == 8) {
			valor = 2;
		} else if (this.num == 9) {
			valor = 3;
		} else if (this.num == 10) {
			valor = 4;
		}
		return valor;
	}
	
	/**
	 * Te dice el valor que tiene el numero de la carta en el juego del Mus
	 * @return Valor de la carta
	 */

	public int getValorMus() {
		int valor = 0;
		if (this.num == 1 || this.num == 2) {
			valor = 1;
		} else if (this.num == 3 || this.num == 8 || this.num == 9 || this.num == 10) {
			valor = 10;
		} else if (this.num == 4) {
			valor = 4;
		} else if (this.num == 5) {
			valor = 5;
		} else if (this.num == 6) {
			valor = 6;
		} else if (this.num == 7) {
			valor = 7;
		}
		return valor;
	}
	
	/**
	 * Te dice el valor que tiene el numero de la carta en el juego 7 y media
	 * @return Valor de la carta 
	 */

	public double getValor7ymedia() {
		double valor = 0;
		if (this.num == 1) {
			valor = 1;
		} else if (this.num == 2) {
			valor = 2;
		} else if (this.num == 3) {
			valor = 3;
		} else if (this.num == 4) {
			valor = 4;
		} else if (this.num == 5) {
			valor = 5;
		} else if (this.num == 6) {
			valor = 6;
		} else if (this.num == 7) {
			valor = 7;
		} else if (this.num == 8 || this.num == 9 || this.num == 10) {
			valor = 0.5;
		}
		return valor;
	}

	@Override
	public String toString() {
		return getNombreCarta();
	}

}
