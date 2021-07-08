import javax.swing.JOptionPane;

/**
 * App que dados unos datos calcula el area d eun circulo, cuadrado o triangulo.
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S3Ud6Ej1App {

	public static void main(String[] args) {
		
		String opcion;
		
		// Pregunta mientras el usuario no ponga C, K o T.
		do {
		opcion = JOptionPane.showInputDialog("Seleccione para calcular el area:"
				+ "\nC = Circulo\nK = Cuadrado\nT = Triangulo");
		
		}while(!opcion.equalsIgnoreCase("C") && !opcion.equalsIgnoreCase("K") 
				&& !opcion.equalsIgnoreCase("T"));
		
		// Pasamos a lower case.
		opcion.toLowerCase();
		
		// Menu.
		switch (opcion) {
		
		// Caso circulo.
		case "c":
			
			// Pide el radio.
			String inputRadio = JOptionPane.showInputDialog("Introduzca el radio del circulo.");
			
			// Parsea el radio a double.
			Double radio = Double.parseDouble(inputRadio);
			
			// Printa llamando a la funcion que calcula el radio.
			System.out.println("El area del ciruclo es: " +areaCirculo(radio)+ ".");
			
			break;
			
		// Caso cuadrado.
		case "k":

			String inputLado = JOptionPane.showInputDialog("Introduzca el tamaño del lado del cuadrado.");
			
			Double lado = Double.parseDouble(inputLado);
			
			System.out.println("El area del cuadrado es: " +areaCuadrado(lado)+ ".");
			
			break;
			
		// Caso triangulo.
		case "t":

			String inputBase = JOptionPane.showInputDialog("Introduzca la base del triangulo.");
			
			Double base = Double.parseDouble(inputBase);
			
			String inputAltura = JOptionPane.showInputDialog("Introduzca la altura del triangulo.");
			
			Double altura = Double.parseDouble(inputAltura);
			
			System.out.println("El area del triangulo es: " +areaTriangulo(base, altura)+ ".");
			
			break;

		default:
			System.out.println("ERROR: Ha introducido una opcion incorrecta.");
			break;
		}
		

	}
	
	// Funcion que calcula el area de un circulo.
	public static double areaCirculo(double radio) {
		double area = Math.pow(radio, 2)* Math.PI;
		return area;
		
	}
	
	// Funcion que calcula el area de un cuadrado.
	public static double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
		
	}
	
	// Funcion que calcula el area de un triangulo.
	public static double areaTriangulo(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
		
	}

}
