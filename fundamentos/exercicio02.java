package fundamentos;
import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite Três número: ");
		
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		
		if ((n1 > n2) && (n1 > n3)) {
			if (n2 > n3) {
				System.out.println("O número "+ n1 + " é o maior, e "+ n3 +" é o menor.");
			}
			System.out.println("O número "+ n1 + " é o maior, e "+ n2 +" é o menor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			if (n1 > n3) {
				System.out.println("O número "+ n2 + " é o maior, e "+ n1 +" é o menor.");
			}
			System.out.println("O número "+ n2 + " é o maior, e "+ n3 +" é o menor.");
		} else if ((n3 > n1) && (n3 > n2)){
			if (n2 > n1) {
				System.out.println("O número "+ n3 + " é o maior, e "+ n1 +" é o menor.");
			}
			System.out.println("O número "+ n3 + " é o maior, e "+ n2 +" é o menor.");
		}
	}
}