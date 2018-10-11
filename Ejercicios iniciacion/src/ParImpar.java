import java.util.Random;
public class ParImpar {
	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero = r.nextInt(1000);
		if (numero%2==0 ) {
			System.out.println(numero + " es par ");
		}
		else {
			System.out.println(numero + " es impar " );
		}
	}
}
