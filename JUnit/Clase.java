package es.edix.ed.recuperacion;

import org.junit.platform.commons.util.StringUtils;

/**
 * Esta clase consta de dos partes. El método saludar intenta convertir a un
 * número entero el String nombre, si lo consigue devuelve NFE, si no lo
 * consigue captura una excepción y mira a ver si el nombre está vacío. Si lo
 * está devuelve BLANK. Si no pudo convertirlo y no estaba vacío devuelve "Hola
 * "+ nombre.
 * 
 * Y el metodo matematicas tiene una estructura de control switch case para
 * realizar operaciones de suma, resta, multiplicación y division.
 *
 * @author Ivan
 * @since 26/6/2021
 * @version 2.0
 */

public class Clase {
	//Variable de tipo constante que no se puede sobreescribir
	private static final String NFE = "Lo que me mandas es un numero"; 
	//Variable de tipo constante que no se puede sobreescribir			
	private static final String BLANK = "Lo que me mandas está vacío"; 

	/**
	 * 
	 * @param nombre Nombre tipo String
	 * Integer.parseInt(nombre) Intenta convertir el nombre en un número entero	
	 * @return NFE Si consigue convertirlo nos devuelve el String NFE
	 * @throws NumberFormatException e Captura la excepción y chequea que el nombre no esté vacío
     * @return BLANK Si el nombre está vacío devuelve el String BLANK
     * 
     * "Hola "+ nombre Si el programa no ha podido convertir el nombre a entero y el campo nombre es correcto
	 */
	
	public String saludar(String nombre) {
		try {
			Integer.parseInt(nombre);
			return NFE;
		} catch (NumberFormatException e) {
		}
		if (StringUtils.isBlank(nombre)) {
			return BLANK;
		}
		return "Hola " + nombre;
	} // Cierre de constructor

	/**
	 * 
	 * @param x Primer valor entero
	 * @param y Segundo valor entero
	 * @param op Nombre de la operación que vamos a realizar
	 * @return Sumar x + y, Restar x - y, Multiplicar x * y, Dividir x / y
	 */
	public double matematicas(int x, int y, String op) { //Estructura de control switch case
		switch (op) {
		case "sumar":
			return x + y;
		case "restar":
			return x - y;
		case "multiplicar":
			return x * y;
		case "dividir":
			return x / y;
		default:
			return Double.valueOf(String.format("%1d.%2d", x, y));
		}
	}//Cierre de la estructura de control

}// Cierre de la clase
