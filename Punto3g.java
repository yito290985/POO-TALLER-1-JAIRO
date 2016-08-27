import java.text.DecimalFormat;
import java.util.Scanner;

public class Punto3g{
	
	public static void main(String[] args) {

String cadena;
		int cantidad = 0;
		Scanner entradaCadena = new Scanner(System.in);
		
		System.out.println("\nPunto 3.g:\n");
		System.out.println("Por favor ingrese un texto:");
		
		cadena = entradaCadena.nextLine();
		
		for(int f = 1; f <= cadena.length(); f++) {
			cantidad++;
		}
		System.out.println("\nLa cantidad de caracteres contenido en el texto " + cadena + " es: " + cantidad);
	}
}
