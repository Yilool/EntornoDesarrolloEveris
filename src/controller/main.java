package controller;

import logic.helper;
import model.Cars;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars coche = new Cars("Marca", "Modelo", 4, "Gasolina");
		Cars coCars = new Cars();

		System.out.println(helper.Bienvenido());
		
		coCars.setMarca("Marca");
		coCars.setModelo("Modelo");
		coCars.setNumPasajero(2);
		coCars.setTipCombustible("Diesel");
		
		System.out.println("Coches:");
		System.out.println(coche.toString()+"\n");
		System.out.println(coCars.toString());
		System.out.println(helper.numPasajeroString(coche));
		System.out.println(helper.numPasajeroString(coCars));
	}

}
