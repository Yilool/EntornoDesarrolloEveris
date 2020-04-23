package controller;

import model.Cars;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars coche = new Cars("Marca", "Modelo", 4, "Gasolina");
		Cars coCars = new Cars();
		
		coCars.setMarca("Marca");
		coCars.setModelo("Modelo");
		coCars.setNumPasajero(2);
		coCars.setTipCombustible("Diesel");
		
		System.out.println(coche.toString()+"\n");
		System.out.println(coCars.toString());
	}

}
