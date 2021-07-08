import javax.swing.JOptionPane;

/**
 * App que crea un array, se le indica un numero y muestra solo los nuemros del array que terminan en ese numero.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej12App {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 300;
		int digito;
		
		// Pide el tamaño del array
		String inputArray = JOptionPane.showInputDialog("Escriba el tamaño del array.");
		
		// Parsea el tamaño.
		int tamanyoArray = Integer.parseInt(inputArray);
		
		// Indica el tamaño al array1
		int array1[] = new int[tamanyoArray];
		
		// Rellena array1 con numeros aleatorios.
		generaNumeros(array1, min, max);
		
		do {
			// Pide el digito
			String inputDigito = JOptionPane.showInputDialog("Escriba un digito del 0 al 9.");

			// Parsea
			digito = Integer.parseInt(inputDigito);
			
		}while(digito < 0 || digito > 9);
		
		// Saca por consola todos los numeros del array que terminan igual que el digito.
		mostrarArray(compruebaDigitoFinalArray(digito, array1, tamanyoArray));
			

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
	
	// Funcion que recibe un digito y un array,
	// comprueba el final de cada valor de cada posicion del array y 
	// guarda en un array solo los valores que terminan igual que el digito recibido.
	public static int[] compruebaDigitoFinalArray(int digito, int array[], int tamanyoArray) {
		
		int arraySalida[] = new int[tamanyoArray];
		
		int ultimoDigito;
		
		for (int i = 0; i < array.length; i++) {
			
			// Guarda en una variable el ultimo digito del valor 
			// de la posicion actual del array.
			ultimoDigito = array[i]%10;
			
			// Si el digito del array es igual al que el usuario ha elegido
			// Se guarda en un nuevo array.
			if(ultimoDigito == digito) {
				arraySalida[i] = array[i];
				
			}
			
		}
		
		// Retorna el array.
		return arraySalida;
		
	}
	
	// Funcion que recibe un array, lo recorre,
	//	muestra los valores de cada posicion y los suma en un total.
	public static void mostrarArray(int array[]) {
		
		// Recorre el array y printa el indice y lo que contiene en esa posicion.
		for (int i = 0; i < array.length; i++) {
			
			// Detalle estetico.
			if(i < 9 && array[i] >= 0) {
				
				// Muestra el indice y el valor.
				System.out.println("Posicion  " +(i+1)+ ": " +array[i]);
				
			}else if(i > 9 && array[i] >= 0){
				System.out.println("Posicion " +(i+1)+ ": " +array[i]);

				
			}
		}
		
	}

}
