import java.util.Scanner;
public class XdivisibleY {
	public static void main(String[] args) {
		 Scanner in= new Scanner(System.in);
		 int x;
		 int y;
		 System.out.println("ingresa un numero");              
	        x = in.nextInt();
	        System.out.println("ingresa un numero");              
	        y = in.nextInt();
	        if(x%y==0){
	            System.out.println(x+" es divisible de "+y);
	        	}
	        else{
	       System.out.println(x + " no es divisible " +y); 
	    }
	}
}
