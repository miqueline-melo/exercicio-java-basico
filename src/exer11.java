import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("entre com 1 numero inteiro");
		 int numero1 = scan.nextInt();
		 
		 System.out.println("entre com outro numero inteiro");
		 int numero2 = scan.nextInt();
		 
		 System.out.println("entre com 1 numero real");
		 double numero3 = scan.nextDouble();
		 		 
		 int resultado1 = (numero1*2) * (numero2/2);
		 double resultado2 = (numero1*3) + numero3;
		 double resultado3 = Math.pow(numero3, numero3);
		 
		 System.out.println("resultado 1 e:" + resultado1);
		 System.out.println("resultado 2 e:" + resultado2);
		 System.out.println("resultado 3 e:" + resultado3);
		 
		 
	}

}
