package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiratesMethodTest {

	@Test
	public void testisDead() {
		Pirate p = new Pirate("Captain Crunch");
		assertFalse(p.isDead());
	}

}
