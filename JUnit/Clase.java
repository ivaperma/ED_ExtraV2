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
	private static final String BLANK = "Lo que me mandas est� vac�o"; 

	/**
	 * El m�todo saludar intenta convertir a un n�mero entero el String nombre, si lo consigue nos devuelve
	 * la cadena de texto NFE, si no lo consigue captura una excepci�n y mira si el nombre est� vac�o. Si lo
	 * est� devuelve la cadena de texto BLANK. Si no puedo convertirlo y no estaba vac�o devuelve "Hola " +nombre.
	 * 
	 * @param nombre Primera variable de entrada que se va a evaluar, debe ser un texto sin n�meros, si no produce un error.
	 * Integer.parseInt(nombre) Intenta convertir el nombre en un n�mero entero	
	 * @return NFE Devuelve la cadena de texto que contiene NFE = "Lo que me mandas es un numero"
	 * @throws NumberFormatException e Captura la excepci�n y chequea que el nombre no est� vac�o
     * @return BLANK Devuelve la cadena de texto que contiene BLANK = "Lo que me mandas est� vac�o"
     * Devuelve un saludo en formato 'Hola ...' en caso de que el nombre sea v�lido y no contenga n�meros.
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
	 * Estructura de control switch case que eval�a y realiza operaciones de
	 * suma, resta, multiplicaci�n y divisi�n.
	 * 
	 * @param x Primer valor de la operaci�n que se va a ejecutar
	 * @param y Segundo valor de la operaci�n que se va a ejecutar
	 * @param op Nombre de la operaci�n que vamos a realizar, debe estar en min�scula, si no dar�a error.
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
