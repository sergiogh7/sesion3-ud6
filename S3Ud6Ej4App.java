import javax.swing.JOptionPane;

/**
 * App que dado un numero indica si es primo o no.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej4App {

	public static void main(String[] args) {
		
		// Pide el numero.
		String inputNumero = JOptionPane.showInputDialog("Escriba un numero para saber el factorial.");
		
		// Parsea a integer.
		int numero = Integer.parseInt(inputNumero);
		
		// Recoge el resultado llamando a la funcion que realiza el calculo.
		int resultado = factorial(numero);
		
		// Ventana con mensaje.
		JOptionPane.showMessageDialog(null, "El factorial de " +numero+ " es " +resultado+ ".");
		

	}
	
	// Calcula el factorial de un numero pasado por parametro
	// devuelve un resultado integer.
	public static int factorial(int numero) {
		
        int resultado = 1;
        
        for (int i = 1; i <= numero; i++) {
        	
            resultado *= i;
            
        }
        
        return resultado;
    }

}
