import javax.swing.JOptionPane;

/**
 * App que dado un numero lo pasa de decimal a binario.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej5App {

	public static void main(String[] args) {
		
		// Variables.
		String inputNumero;
		double numero;
		
		// Bucle que no cesa hasta que se ponga un numero mayor que 0.
        do{ 
        	// Pide el numero.
            inputNumero = JOptionPane.showInputDialog("Introduce un numero entero mayor que 0.");
            
            // Parsea a integer.
            numero = Double.parseDouble(inputNumero);
            
        }while( numero < 0);
       
       // Guarda el numero binario llamando a la funcion.
       double numBinario = binario((int)numero);
       
       // Mensaje.
       JOptionPane.showMessageDialog(null, "El numero binario del " +numero+ " es " + (int)numBinario);

	}
	
	// Funcion que saca el numero binario de un numero pasado por parametro y retorna un doble.
	public static double binario(int numero) {
		
		int digito;
		int exponente;
		double binario;
		
		exponente=0;
        binario=0;
        
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exponente);                                                   
                exponente++;
                numero = numero/2;
        }
        
        return binario;
		
	}

}
