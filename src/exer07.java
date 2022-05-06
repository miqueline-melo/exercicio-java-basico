import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Entre com o lateral do quadrado:\n ");
	double quadrado = scan.nextDouble();
	double area = Math.pow(quadrado, 2);
	System.out.println("area do quadrado e : " + area);
	System.out.println("o dobro da area do quadrado e: " + (area*2));

	}

}
