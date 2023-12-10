package edu.greenriver.sdev.fridaylabdec8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import objects.Dice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Fridaylabdec8ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testRollWithinBounds() {
		Dice sixSidedDice = new Dice(6, "Red");
		int result = sixSidedDice.roll();
		assertTrue(result >= 1 && result <= 6, "Roll result should be within the bounds of 1 to 6");
	}

	@Test
	public void testToString() {
		Dice twelveSidedDice = new Dice(12, "Green");
		assertEquals("A 12 sided die", twelveSidedDice.toString(), "ToString method should return the correct string");
	}

	@Test
	public void testGetSides() {
		Dice fourSidedDice = new Dice(4, "Yellow");
		assertEquals(4, fourSidedDice.getSides(), "getSides should return the correct number of sides");
	}

	@Test
	public void testGetColor() {
		Dice tenSidedDice = new Dice(10, "Purple");
		assertEquals("Purple", tenSidedDice.getColor(), "getColor should return the correct color");
	}

}
