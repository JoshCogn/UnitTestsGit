package com.josh.UnitTests;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathTestNG {
	
	MathClass mathClass;

	@BeforeMethod
	public void beforeMethod() {
		mathClass = new MathClass();
	}
  
	@Test
	public void addTest2() {
		int result = mathClass.add(2, 2);
		assertEquals(4,result);
		System.out.println("testNGMath");
	}
}
