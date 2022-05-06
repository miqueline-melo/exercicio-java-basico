import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("temperatura em celsius: ");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		System.out.println("A tempertura e: " + c + " C e igual a " + f + " F " );
		
	}

}
