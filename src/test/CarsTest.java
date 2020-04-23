package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logic.helper;
import model.Cars;

class CarsTest {
	@BeforeEach
	void init() {
		Cars c1 = new Cars("marca", "modelo", 4, "gasolina");
	}

	@Test
	void testAddPasajero(Cars c1) {
		helper.addPasajero(c1, 2);
		
		assertEquals(6, c1.getNumPasajero());
	}

	@Test
	void testSubPasajero(Cars c1) {
		helper.subPasajero(c1, 2);
		
		assertEquals(2, c1.getNumPasajero());
	}

}
