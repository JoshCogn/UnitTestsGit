package com.josh.UnitTests;

import static org.junit.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MathClassTest {
	
	MathClass mathClass;

	@BeforeMethod
	public void setUp() throws Exception {
		mathClass = new MathClass();
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void addTest() {
		int result = mathClass.add(1, 2);
		assertEquals(3,result);
		System.out.println("mathClassTest");
	}

}
