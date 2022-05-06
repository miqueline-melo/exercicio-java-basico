import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
  Scanner scan = new Scanner(System.in);
  System.out.println("digite a quantidade de metros: ");
  
  double metros = scan.nextDouble();
  double cm = metros*100;
  
  System.out.println(metros + " metros e igual a "+ cm + "cm");
  
	}

}
