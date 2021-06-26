package es.edix.ed.recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClase {
	
	private Clase cut;
	
	//Lo usamos para que se ejecute antes de cada @Test
	@BeforeEach
	void setUp() throws Exception {
		cut = new Clase();
	}
	//Se usa para ejecutarse al finalizar cada @Test
	@AfterEach
	void tearDown() throws Exception {
		
	}
	
	//Primera prueba unitaria de saludar()
	@Test
	void testEsperoNombrePedroObtengoVacio() {
		// Arrange - Preparar
		String esperado = "Lo que me mandas está vacío";
		String nombre = "Pedro";
		// Act - ejecutar
		String obtenido = cut.saludar("");
		//Sacamos por pantalla el valor obtenido
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testEsperoNombreObtengoNombre() {
		// Arrange - Preparar
		String esperado = "Hola Oliver";
		String nombre = "Oliver";
		// Act - ejecutar
		String obtenido = cut.saludar(nombre);
		//Sacamos por pantalla el valor obtenido
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testEsperoNumeroObtengoNombre() {
		// Arrange - Preparar
		String esperado = "Lo que me mandas es un numero";
		String nombre = "22";
		// Act - ejecutar
		String obtenido = cut.saludar(nombre);
		//Sacamos por pantalla el valor obtenido
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	//Comienzo de pruebas de clase matematicas
	@Test
	void testSuma() {
		// Arrange - Preparar
		int x = 10;
		int y = 5;
		String op = "sumar";
		int esperado = 15;
		// Act - ejecutar
		double obtenido = cut.matematicas(x, y, op);
		// Imprimimos el valor de obtenido para visualizar el resultado
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testResta() {
		// Arrange - Preparar
		int x = 10;
		int y = 5;
		String op = "restar";
		int esperado = 5;
		// Act - ejecutar
		double obtenido = cut.matematicas(x, y, op);
		// Imprimimos el valor de obtenido para visualizar el resultado
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testMultiplicacion() {
		// Arrange - Preparar
		int x = 10;
		int y = 5;
		String op = "multiplicar";
		int esperado = 50;
		// Act - ejecutar
		double obtenido = cut.matematicas(x, y, op);
		// Imprimimos el valor de obtenido para visualizar el resultado
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testDivision() {
		// Arrange - Preparar
		int x = 10;
		int y = 5;
		String op = "dividir";
		int esperado = 2;
		// Act - ejecutar
		double obtenido = cut.matematicas(x, y, op);
		// Imprimimos el valor de obtenido para visualizar el resultado
		System.out.println(obtenido);
		// Assert - comprobar
		assertEquals(esperado, obtenido);
	}
	
}
