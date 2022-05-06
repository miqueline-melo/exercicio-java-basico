import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("temperatura em farenheit: ");
		double F = scan.nextDouble();
		
		double C = (5*(F-32)/9);
		System.out.println("A tempertura e: " + F + " F e igual a " + C + " C " );
		
	}

}
