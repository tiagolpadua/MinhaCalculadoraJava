package com.caelum.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}
	
	@AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
	
	@Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }
	
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

	@Test
	public void testSoma() {
		Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.soma(2, 1));
		System.out.println("@Test - testSoma");
	}
	
	@Test
	public void testIncremento() {
		System.out.println("@Test - testIncremento");
		Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.incrementa(2));
	}
}

