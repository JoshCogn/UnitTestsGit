package com.josh.UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathClassTests {
	
	MathClass mathClass;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mathClass = new MathClass();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addTest() {
		int result = mathClass.add(1, 2);
		assertEquals(3,result);
	}

}
