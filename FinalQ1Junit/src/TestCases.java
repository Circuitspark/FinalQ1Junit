import static org.junit.Assert.*;
import java.util.HashMap;

import java.util.UUID;

import org.junit.Test;

import Vehicle.MotorCycle;
import Vehicle.Person;
import Vehicle.Truck;


public class TestCases {

	@Test
	public void testHash() {
		Person first = new Person("Don", "Merritt", UUID.randomUUID());
		Person second = new Person("Brendan", "Quinn", UUID.randomUUID());
		Truck pickup = new Truck("Git'r'Done Mobile", "Red", 230.5, first, 2);
		MotorCycle vroom = new MotorCycle("Rice Burner", "Green", 150.5, first, false);
		pickup.transferOwnership(second);
		HashMap hash = new HashMap();
		HashMap testhash = new HashMap();
		hash.put(pickup, vroom);
		assertEquals(hash, testhash.put(pickup, vroom));
	}

}
