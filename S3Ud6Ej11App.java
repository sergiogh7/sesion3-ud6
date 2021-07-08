import javax.swing.JOptionPane;

/**
 * App
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej11App {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 50;
		
		// Pide el tamaño del array
		String inputArray1 = JOptionPane.showInputDialog("Escriba el tamaño del array 1.");
		
		// Parsea el tamaño.
		int tamanyoArray1 = Integer.parseInt(inputArray1);
		
		// Indica el tamaño al array1
		int array1[] = new int[tamanyoArray1];
		
		// Rellena array1 con numeros aleatorios.
		generaNumeros(array1, min, max);
		
		// Pide el tamaño del array2
		String inputArray2 = JOptionPane.showInputDialog("Escriba el tamaño del array 2.");
		
		// Parsea el tamaño.
		int tamanyoArray2 = Integer.parseInt(inputArray2);
		
		// Indica el tamaño al array2
		int array2[] = new int[tamanyoArray2];
		
		// Array2 apunta a Array1
		array2 = array1;
		
		// Rellena array2 con numeros aleatorios.
		generaNumeros(array2, min, max);
		
		// Printa array1.
		System.out.println("Array1:");
		mostrarArray(array1);
		
		// Printa array2.
		System.out.println("\nArray2:");
		mostrarArray(array2);
		
		System.out.println("\nArray3:");
		// Printa el array3 que viene lleno de la funcion multiplicarArray.
		mostrarArray(multiplicaArray(array1, array2));

	}
	
	// Funcion que genera numeros aleatorios y los introduce en el array que llega por parametro.
	public static void generaNumeros(int array[], int min, int max) {
		
		// Recorre el array.
		for (int i = 0; i < array.length; i++) {
			
			// Genera un numero aletorio.
			double numAleatorio = Math.floor(Math.random()*(max-min+1)+min);
			
			// Rellena la posicion actual del array con un numero aleatorio.
			array[i] = (int)numAleatorio;
	
		}
		
	}
	
	// Funcion que recibe dos arrays por parametro y devuelve uno nuevo 
	//	con la multiplicacion de cada posicion del array1 con el array2.
	public static int[] multiplicaArray(int array1[], int array2[]) {
		
		// Inicia el array3 que luego va a ser sobreescrito.
		 int array3[] = array1;
		
		 // Recorre cada posicion y multiplica los numeros de array1 con los de array2 
		 //	y los guarda en array3.
		for (int i = 0; i < array1.length; i++) {
			
			array3[i] = array1[i] * array2[i];
			
		}
		
		// Retorna el array3.
		return array3;
	}
	
	// Funcion que recibe un array, lo recorre,
	//	muestra los valores de cada posicion y los suma en un total.
	public static void mostrarArray(int array[]) {
		
		// Recorre el array y printa el indice y lo que contiene en esa posicion.
		for (int i = 0; i < array.length; i++) {
			
			// Detalle estetico.
			if(i < 9) {
				
				// Muestra el indice y el valor.
				System.out.println("Posicion  " +(i+1)+ ": " +array[i]);
				
			}else {
				System.out.println("Posicion " +(i+1)+ ": " +array[i]);

				
			}
		}
		
	}

}
