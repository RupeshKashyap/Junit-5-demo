package com.rupesh;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // changing default instance behavior
@DisplayName("Running Math clas")
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
//	@EnabledOnOs(OS.LINUX)
	void devide() {
		Boolean isServerUp = false;
		assumeTrue(isServerUp);
//		for exception handling we  are user assertThrows
		//  lambda expression not supported in junit 4 for ssertThrow 
//		MathUtils mathUtils = new MathUtils();
//		assertThrows(NullPointerException.class, () -> mathUtils.devide(1, 0),"Devide by zero should throw");
		assertThrows(ArithmeticException.class, () -> mathUtils.devide(1, 0),"Devide by zero should throw"); // correct 
		
	}
	
	
	@Nested
	class testAdd {
		
		@Test
		@DisplayName("When adding two positive number")
		void testPositive() {
			assertEquals(2, mathUtils.add(1, 1),"This method should add two number");
		}
		
		@RepeatedTest(3)
		@DisplayName("When adding two negative number")
		void testNegative() {
			int actual = mathUtils.add(-1, -1);
			int expected = -2;  
//			using the 3rd argument as a Lambda it will execute only when test case fails 
			assertEquals(expected,actual , () -> "testNegative expected "+expected+" but returning "+actual);
		}
		
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
	
	@Test
	@DisplayName("Multiply testing")
	void multiply() {
//		assertAll from junit 5
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0,  mathUtils.multiply(2, 0)),
				() -> assertEquals(-4,  mathUtils.multiply(2, -2))
				);
	}
	

}
