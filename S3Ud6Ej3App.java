import javax.swing.JOptionPane;

/**
 * App que dado un numero indica si es primo o no.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej3App {

	public static void main(String[] args) {
		
		// Pide el nuemro.
		String inputNumero = JOptionPane.showInputDialog("Introduzca un numero para saber si es numero primo.");
		
		// Parsea a integer.
		int numero = Integer.parseInt(inputNumero);
		
		// Si al llamar la funcion retorna true, es primo, false = no primo.
		if(esPrimo(numero)) {
			// Mensaje que muestra que es primo.
			JOptionPane.showMessageDialog(null, "El numero " +numero+ " es primo.");
			
		}else {
			JOptionPane.showMessageDialog(null, "El numero " +numero+ " NO es primo.");
			
		}

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
