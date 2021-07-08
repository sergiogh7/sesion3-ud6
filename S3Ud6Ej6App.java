import javax.swing.JOptionPane;

/**
 * App que  cuenta las cifras de un numero entero positivo.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej6App {

	public static void main(String[] args) {
		
		int numero;
		
		// Pide el numero mientras no exista o sea negativo.
		do {
			
		// Pide el numero.
		String inputNumero = JOptionPane.showInputDialog("Escriba un numero entero positivo.");
		
		// Parsea a integer.
		numero = Integer.parseInt(inputNumero);
		
		}while(numero < 0);
		
		// Guarda el resultado que devuelve la funcion cuentaCifras.
		int resultado = cuentaCifras(numero);
		
		// Mensaje.
		JOptionPane.showMessageDialog(null,"El numero de cifras del numero " +numero+ " es de " +resultado+ ".");

	}
	
	// Funcion que cuenta las cifras de un numero pasado por parametro.
	public static int cuentaCifras(int numero) {
		
		int resultado = 0;
		
		// Mientras el nuemro no sea 0 sigue sividiendo.
		while(numero != 0) {
			
			// Divide el numero entre 10.
			numero /= 10;
			
			// Cada vez que es dividido suma 1 a resultado.
			resultado++;
		}

		
		return resultado;
		
	}

}
