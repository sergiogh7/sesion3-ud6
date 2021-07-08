import javax.swing.JOptionPane;

/**
 * App
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej8App {

	public static void main(String[] args) {
		
		String array[] = new String[10];
		
		// Llama a la funcion que rellena el array.
		rellenarArray(array);
		
		// llama a la funcion que muestra el array.
		muestraArray(array);

	}
	
	// Funcion para rellenar un array.
	public static String[] rellenarArray(String array[]) {
		
		// Recorre el array que ha llegado por parametro y va pidiendo rellenarlo.
		for (int i = 0; i < array.length; i++) {
			
			array[i] = JOptionPane.showInputDialog("Escriba el valor de la posicion: " + (i+1));
		}
		
		return array;
	}
	
	// Funcion que muestra el array.
	public static void muestraArray(String array[]) {
		
		// Recorre el array y printa el indice y lo que contiene en esa posicion.
		for (int i = 0; i < array.length; i++) {
			if(i < 9) {
				System.out.println("Posicion  " +(i+1)+ ": " +array[i]);
				
			}else {
				System.out.println("Posicion " +(i+1)+ ": " +array[i]);
				
			}
		}
	}

}
