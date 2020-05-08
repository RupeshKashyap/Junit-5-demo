package com.rupesh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // changing default instance behavior 
class MathUtilsTest {
	
	MathUtils mathUtils ;
	
	@BeforeAll
	 void beforeAll() {
	System.out.println("This needs to run before all");
	}
	
	@BeforeEach
	void init() {
	 mathUtils = new MathUtils();

	}
	
	@AfterEach
	void cleaup() {
		System.out.println("Cleanup...");
	}

//	telling this this method in for testing
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		int actual = mathUtils .add(1, 1);
		int expected = 2;
		assertEquals(expected, actual,"The add() method should add two number");
	}
	
	@Test
	void devide() {
//		for exception handling we  are user assertThrows
		//  lambda expression not supported in junit 4 for ssertThrow 
//		MathUtils mathUtils = new MathUtils();
//		assertThrows(NullPointerException.class, () -> mathUtils.devide(1, 0),"Devide by zero should throw");
		assertThrows(ArithmeticException.class, () -> mathUtils.devide(1, 0),"Devide by zero should throw"); // correct 
		
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.53981633974483, new MathUtils().computeCircleArea(5));
	}
	
	@Test
	@Disabled
	@DisplayName("Method should not run")
	void disableed() {
		int actual = mathUtils .add(1, 1);
		int expected = 2;
		assertEquals(expected, actual,"The add() method should add two number");
	}
	

}
