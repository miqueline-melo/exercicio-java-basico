import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("digite um numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("a soma dos 2 numero e:" + resultado);
	}

}
