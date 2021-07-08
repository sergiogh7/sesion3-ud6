import javax.swing.JOptionPane;

/**
 * App
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej10App {

	public static void main(String[] args) {
		
		// Variables que indicaran el minimo y maximo 
		// de los numeros aleatorios a generar.
		int minimo;
		int maximo;
		
		// Pide el tamaño del array
		String inputArray = JOptionPane.showInputDialog("Escriba el tamaño del array.");
		
		// Parsea el tamaño.
		int tamanyoArray = Integer.parseInt(inputArray);
		
		// Pide los numeros minimo y maximo siempre que el minimo sea mayor que el maximo.
		do {
			// Pide el minimo
			String inputMinimo = JOptionPane.showInputDialog("Escriba el numero minimo aleatorio a generar.");
			// Parsea.
			minimo = Integer.parseInt(inputMinimo);
			
			// Pide el maximo
			String inputMaximo = JOptionPane.showInputDialog("Escriba el numero maximo aleatorio a generar.");
			// Parsea.
			maximo = Integer.parseInt(inputMaximo);
			
		}while(maximo < minimo);
		
		// Asigna el tamaño al array.
		int array[] = new int[tamanyoArray];
		
		// Mensaje que muestra el numero mayor despues de llamar a las funciones numeroMayor y generaNumeros.
		JOptionPane.showMessageDialog(null, "El numero mayor del array es el: " 
										+ numeroMayor(generaNumeros(array, minimo, maximo)));

	}
	
	// Funcion que recibe un array, va generando numeros aleatorios, 
	// y si es primo lo guarda en la posicion actual.
	public static int[] generaNumeros(int array[], int min, int max) {
		
		// Recorre el array.
		for (int i = 0; i < array.length; i++) {
			
			// Genera un numero aletorio.
			double numAleatorio = Math.floor(Math.random()*(max-min+1)+min);
			
			// Comprueba si el numero aleatorio es primo.
			if(esPrimo((int)numAleatorio)) {
				
				// Rellena la posicion actual del array con un numero aleatorio.
				array[i] = (int)numAleatorio;
			
			// Si el numero no es primo resta una posicion para volver a intentarlo.
			}else {
				i--;
				
			}
		}
		
		return array;
		
	}
	
	// Funcion que recibe un array y busca el numero mayor.
	public static int numeroMayor(int array[]) {
		
		int numeroMayor = 0;
		
		// Recorre el array para ver cual es el numero mas grande.
		for (int i = 0; i < array.length; i++) {
			
			// Si el numero de la posicion actual del array es mayor 
			// que la variable numeroMayor que de inicio vale 0...
			// numeroMayor pasa a ser el mismo que el de la posicion actual del array.
			if(array[i] > numeroMayor) {
				
				// El numero mayor
				numeroMayor = array[i];

			}
		}
		
		// Retorna el numero mas grande del array.
		return numeroMayor;
	}
	
	// Funcion que al pasarle un numero mira si es primo o no, devuelve un boolean.
	public static boolean esPrimo(int numero) {
		
		boolean esPrimo = true;
		
	    if(numero < 2){
	    	esPrimo = false;
	    	
	    }else{
	    	
	        for(int i=2; i*i<=numero; i++){
	        	
	            if( numero%i==0 ){
	            	esPrimo = false;
	            	
	            }
	        }
	    }
		
		return esPrimo;
		
	}

}
