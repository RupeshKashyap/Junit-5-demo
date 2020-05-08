package com.rupesh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

//	telling this this method in for testing
	@Test
	void testAdd() {
		int actual = new MathUtils().add(1, 1);
		int expected = 2;
		assertEquals(expected, actual,"The add() method should add two number");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.53981633974483, new MathUtils().computeCircleArea(5));
	}

}
