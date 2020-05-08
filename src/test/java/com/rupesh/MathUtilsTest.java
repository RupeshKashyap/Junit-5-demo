package com.rupesh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MathUtilsTest {

//	telling this this method in for testing
	@Test
	void testAdd() {
		int actual = new MathUtils().add(1, 1);
		int expected = 2;
		assertEquals(expected, actual,"The add() method should add two number");
	}
	
	@Test
	void devide() {
//		for exception handling we  are user assertThrows
		//  lambda expression not supported in junit 4 for ssertThrow 
		MathUtils mathUtils = new MathUtils();
		assertThrows(NullPointerException.class, () -> mathUtils.devide(1, 0),"Devide by zero should throw");
		
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.53981633974483, new MathUtils().computeCircleArea(5));
	}
	

}
