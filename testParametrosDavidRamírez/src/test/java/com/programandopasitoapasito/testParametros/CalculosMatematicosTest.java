package com.programandopasitoapasito.testParametros;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.framework.TestCase;

public class CalculosMatematicosTest extends TestCase {
	
		
		@DisplayName(value = "potencia")
		@ParameterizedTest
		@CsvSource(value = {"1,1,1", "2,2,4", "2,10,1024", "5,11,48828125" })
		public void potenciaTest(int base, int exponente, int resultadoEsperado) {
			assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
		}
		
		
	
		// PRIMO
		@Test
		void testEsPrimo() {
			assertTrue(CalculosMatematicos.esPrimo(11));
		}
		
		// NO PRIMO
		@Test
		void testNoEsPrimo() {
			assertFalse(CalculosMatematicos.esPrimo(339933));
		}	
		
		// PRIMO
		@Test
		void testEsPrimo2() {
			assertTrue(CalculosMatematicos.esPrimo(1));
		}
			
		// NO PRIMO
		@Test
		void testNoEsPrimo2() {
			assertFalse(CalculosMatematicos.esPrimo(10));
		}

		
		
		
		
	    // Caso límite
	    @Test
	    public void test0() {
	        assertEquals(1, CalculosMatematicos.factorial(0));
	    }

	    
	    // Caso límite
	    @Test
	    public void test1() {
	        assertEquals(1, CalculosMatematicos.factorial(1));
	    }

	    
	    // Caso normal
	    @Test
	    public void test5() {
	        assertEquals(120, CalculosMatematicos.factorial(5));
	    }
	    
	    @Test
	    public void test6() {
	        assertEquals(720, CalculosMatematicos.factorial(6));
	    }
	    
	    @Test
	    public void test4() {
	        assertEquals(24, CalculosMatematicos.factorial(4));
	    }
	    
	    
		

}
