package model;

public class Cars {
	private String marca;
	private String modelo;
	private int numPasajero;
	private String tipCombustible;
	
	public Cars() {
		super();
	}
	
	public Cars(String marca, String modelo, int numPasajero, String tipCombustible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPasajero = numPasajero;
		this.tipCombustible = tipCombustible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPasajero() {
		return numPasajero;
	}

	public void setNumPasajero(int numPasajero) {
		this.numPasajero = numPasajero;
	}

	public String getTipCombustible() {
		return tipCombustible;
	}

	public void setTipCombustible(String tipCombustible) {
		this.tipCombustible = tipCombustible;
	}

	@Override
	public String toString() {
		return "Cars [marca=" + marca + ", modelo=" + modelo + ", numPasajero=" + numPasajero + ", tipCombustible="
				+ tipCombustible + "]";
	}
}
