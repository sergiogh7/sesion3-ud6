import java.util.Arrays;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * App que dado una cantidad generara numeros aleatorios entre dos rangos asignados.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej2App {

	public static void main(String[] args) {
		
		// Pide la cantidad de numeros.
		String inputCantidad = JOptionPane.showInputDialog("Introduzca cantidad de \n numeros alatorios a generar.");
		// Parsea a integer.
		int cantidad = Integer.parseInt(inputCantidad);
		
		// Pide el rango minimo.
		String inputRangoMin = JOptionPane.showInputDialog("Introduzca el inicio del rango.");
		// Parsea a integer.
		int rangoMin = Integer.parseInt(inputRangoMin);
		
		// Pide el rango maximo.
		String inputRangoMax = JOptionPane.showInputDialog("Introduzca el final del rango.");
		// Parsea a integer.
		int rangoMax = Integer.parseInt(inputRangoMax);
		
		// Pasa a String el array con numeros aleatorios que viene de la funcion generaNumeros.
		String arrayNumAleatorios = Arrays.toString(generaNumeros(cantidad, rangoMin, rangoMax));
		
		// Muestra una ventana con el array con numeros aleatorios.
		JOptionPane.showMessageDialog(null, arrayNumAleatorios);
		
	}
	
	// Funcion que pasandole una cantidad, un minimo y un maximo
	// genera numeros aleatorios, devuelve un array lleno de esos numeros.
	public static int[] generaNumeros(int cantidad, double min, double max) {
		
		// Variable para guardar el numero generado aleatoriamente.
		double numAleatorio;
		
		// Crea un array con el numero de numAleatorios a guardar.
		int array[] = new int[cantidad];
		
		// Genera numeros mientras i sea menor a cantidad.
		for (int i = 0; i < cantidad; i++) {
			
			// Genera un numero aletorio.
			numAleatorio = Math.floor(Math.random()*(max-min+1)+min);
			
			// Guarda el numero aleatorio en el array.
			array[i] = (int)numAleatorio;
			
		}
		
		// Retorna el array.
		return array;
		
	}

}
