package logic;

import model.Cars;

public class helper {
	public static void addPasajero(Cars coche, int numPas) {
		coche.setNumPasajero(coche.getNumPasajero() + numPas);
	}
	
	public static void subPasajero(Cars coche, int numPas) {
		coche.setNumPasajero(coche.getNumPasajero() - numPas);
	}

	public static String numPasajeroString(Cars coche) {
		int pasajero = 0;

		pasajero = coche.getNumPasajero();

		return "Hay "+pasajero+" pasajeros";
	}

	public static String Bienvenido() {
		StringBuilder aux = new StringBuilder("");

		aux.append("Bienvenido");

		return aux.toString();
	}
}
