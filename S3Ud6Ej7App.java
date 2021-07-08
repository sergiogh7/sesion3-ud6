import javax.swing.JOptionPane;

/**
 * App que convienrte una cantidad de euros a dolares, yenes o libras.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej7App {

	public static void main(String[] args) {
		
		// Variables.
		double dolar = 1.28611;
		double yen = 129.852;
		double libra = 0.86;
		String moneda;
		
		// Pide la cantidad de euros a convertir.
		String inputCantidad = JOptionPane.showInputDialog("Indique la cantidad de € a convertir.");
		
		// Parsea a integer.
		double cantidad = Double.parseDouble(inputCantidad);
		
		// Mientras escriba algo que no es dolar, yen o libra sigue preguntando.
		do {
			// Mensaje para elegir la moneda.
			moneda = JOptionPane.showInputDialog("Escriba a que moneda quiere convertir los " +inputCantidad+ "€:"
					+ "\nDolar\nYen\nLibra");
			
			// Pasa el String a lower case.
			moneda.toLowerCase();
			
		}while(!moneda.equalsIgnoreCase("dolar") 
				&& !moneda.equalsIgnoreCase("yen") 
				&& !moneda.equalsIgnoreCase("libra"));
		
		// Menu
		switch (moneda) {
		case "dolar":
			// Llama a la funcion que realiza la conversion
			// y muestra un mensaje.
			conversor(cantidad, dolar, moneda);
			
			break;
			
		case "yen":
			conversor(cantidad, yen, moneda);
			
			break;
			
		case "libra":
			conversor(cantidad, libra, moneda);
			
			break;

		default:
			break;
		}

	}
	
	// Funcion que recibe una cantidad de euros y una moneda y devuelve un mensaje con el cambio.
	public static void conversor(double cantidadEuros, double conversor, String moneda) {
		
		double convertido = 0;
		
		if(moneda.equalsIgnoreCase("dolar")) {
			// Calcula.
			convertido = cantidadEuros * conversor;
			// Muestra mensaje.
			JOptionPane.showMessageDialog(null, cantidadEuros +"€ son " +convertido+ "$.");
			
		}else if(moneda.equalsIgnoreCase("yen")) {
			// Calcula.
			convertido = cantidadEuros * conversor;
			// Muestra mensaje.
			JOptionPane.showMessageDialog(null, cantidadEuros +"€ son " +convertido+ " Yenes.");

		}else {
			// Calcula.
			convertido = cantidadEuros * conversor;
			// Muestra mensaje.
			JOptionPane.showMessageDialog(null, cantidadEuros +"€ son " +convertido+ " Libras.");
		}
		
		
		
	}

}
