import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);	
	float capital;
	float retribucion;
	
	System.out.println("introduce el capital: ");	
	capital = teclado.nextFloat();
	retribucion = capital * .02f;
	System.out.println("Retribucion: " + retribucion);
	
	}
	
}
