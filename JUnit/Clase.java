package es.edix.ed.recuperacion;

import org.junit.platform.commons.util.StringUtils;

/**
 * @author Ivan
 * @since 26/6/2021
 * @version 3.0
 */

public class Clase {
	//Variable de tipo constante que no se puede sobreescribir
	private static final String NFE = "Lo que me mandas es un numero"; 
	//Variable de tipo constante que no se puede sobreescribir			
	private static final String BLANK = "Lo que me mandas está vacío"; 

	/**
	 * El método saludar intenta convertir a un número entero el String nombre, si lo consigue nos devuelve
	 * la cadena de texto NFE, si no lo consigue captura una excepción y mira si el nombre está vacío. Si lo
	 * está devuelve la cadena de texto BLANK. Si no puedo convertirlo y no estaba vacío devuelve "Hola " +nombre.
	 * 
	 * @param nombre Primera variable de entrada que se va a evaluar, debe ser un texto sin números, si no produce un error.
	 * Integer.parseInt(nombre) Intenta convertir el nombre en un número entero	
	 * @return NFE Devuelve la cadena de texto que contiene NFE = "Lo que me mandas es un numero"
	 * @throws NumberFormatException e Captura la excepción y chequea que el nombre no esté vacío
     * @return BLANK Devuelve la cadena de texto que contiene BLANK = "Lo que me mandas está vacío"
     * Devuelve un saludo en formato 'Hola ...' en caso de que el nombre sea válido y no contenga números.
     * 
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
	 * Estructura de control switch case que evalúa y realiza operaciones de
	 * suma, resta, multiplicación y división.
	 * 
	 * @param x Primer valor de la operación que se va a ejecutar
	 * @param y Segundo valor de la operación que se va a ejecutar
	 * @param op Nombre de la operación que vamos a realizar, debe estar en minúscula, si no daría error.
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
			return Double.valueOf(String.format("%1d.%1d", x, y));
		}
	}//Cierre de la estructura de control

}// Cierre de la clase
