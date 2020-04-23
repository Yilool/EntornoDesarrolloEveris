package logic;

import model.Cars;

public class helper {
	public static void addPasajero(Cars coche, int numPas) {
		coche.setNumPasajero(coche.getNumPasajero() + numPas);
	}
	
	public static void subPasajero(Cars coche, int numPas) {
		coche.setNumPasajero(coche.getNumPasajero() - numPas);
	}
}
