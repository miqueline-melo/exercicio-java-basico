import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
																											
		Scanner scan = new Scanner(System.in);
		
		System.out.println("quanto o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantidade de horas trabalhadas no mes:");
		double Horas = scan.nextDouble();
		
		double salario = valorHora * Horas;
		
		System.out.println("O salario e de :" + salario);
	}

}
