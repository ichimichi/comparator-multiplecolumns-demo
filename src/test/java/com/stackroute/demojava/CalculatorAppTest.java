package com.stackroute.demojava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.demojava.jacoco.CalculatorApp;

public class CalculatorAppTest {

	static CalculatorApp calcApp;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calcApp = new CalculatorApp();
		System.out.println("Inside Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Inside before");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Inside after");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd ....");
		assertEquals(10,calcApp.add(6, 4));
	}
	
	@Test
	public void testAddZero() {
		System.out.println("testAddZero ....");
		assertEquals(0,calcApp.add(0, 0));
	}
	
	@Test
	public void testSub() {
		System.out.println("testSubZero ....");
		
		assertEquals(2,calcApp.sub(6, 4));
		
	}
	
	@Test
	public void givennnumberonegreaterthannumbertwosubtraction() {
		System.out.println("testSubZero ....");
		
		assertEquals(2,calcApp.sub(4, 6));
		
	}
	
	@Test
	public void testMul() {
		
		
		assertEquals(100,calcApp.mul(25, 4));
		
	}
	
	@Test
	public void testDiv() {
		
		
		assertEquals(2,calcApp.div(50,25));
		
	}
	
	@Test
	public void divbyzeroShouldreturnzero() {
		
		
		assertEquals(0,calcApp.div(50,0));
		
	}
	
	
	

}
