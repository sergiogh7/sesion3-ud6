import javax.swing.JOptionPane;

/**
 * App
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej9App {

	public static void main(String[] args) {
		
		// Numeros minimo y maximo que usara una 
		// funcion que genera numeros aleatorios.
		int minimo = 0;
		int maximo = 9;
		
		// Pide el tamaño del array
		String inputArray = JOptionPane.showInputDialog("Escriba el tamaño del array.");
		
		// Parsea el tamaño.
		int tamanyoArray = Integer.parseInt(inputArray);
		
		// Crea el array y le asigna el tamaño.
		int array[] = new int[tamanyoArray];
		
		// Llama a la funcion que muestra el array y el total, 
		// llamando a la funcion que genera nuemros aleatorios.
		mostrarArray(generaNumeros(array, minimo, maximo));
		
	}
	
	// Funcion que recibe un array, lo recorre,
	//	muestra los valores de cada posicion y los suma en un total.
	public static void mostrarArray(int array[]) {
		
		int sumaValores = 0;
		
		// Recorre el array y printa el indice y lo que contiene en esa posicion.
		for (int i = 0; i < array.length; i++) {
			
			// Detalle estetico.
			if(i < 9) {
				
				// Muestra el indice y el valor.
				System.out.println("Posicion  " +(i+1)+ ": " +array[i]);
				
				// Suma los valores de cada posicion.
				sumaValores += array[i];
				
			}else {
				System.out.println("Posicion " +(i+1)+ ": " +array[i]);
				
				sumaValores += array[i];
				
			}
		}
		
		// Muestra mensaje.
		System.out.println("La suma de todos los valores es de: " + sumaValores);
		
	}
	
	// Funcion que genera numeros aleatorios y los introduce en el array que llega por parametro.
	public static int[] generaNumeros(int array[], int min, int max) {
		
		// Recorre el array.
		for (int i = 0; i < array.length; i++) {
			
			// Genera un numero aletorio.
			double numAleatorio = Math.floor(Math.random()*(max-min+1)+min);
			
			// Rellena la posicion actual del array con un numero aleatorio.
			array[i] = (int)numAleatorio;
	
		}
		
		// Retorna el array.
		return array;
		
	}

}
