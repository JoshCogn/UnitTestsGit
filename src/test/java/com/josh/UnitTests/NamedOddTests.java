package com.josh.UnitTests;

import static org.junit.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NamedOddTests {

	@BeforeMethod
	public void setUp() throws Exception {
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String browser = System.getProperty("browser");
		System.out.println("broswer: " + browser);
		MathClass m = new MathClass();
		assertEquals(m.add(1, 1), 2);
		System.out.println("namedOddTests");
	}

}
