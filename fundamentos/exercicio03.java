package fundamentos;
import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		double resp = entrada.nextDouble();
		
		if (resp == 1) {
			System.out.println("Domingo.");
		} else if (resp == 2) {
			System.out.println("Segunda.");
		} else if (resp == 3) {
			System.out.println("Segunda.");
		} else if (resp == 4) {
			System.out.println("Segunda.");
		} else if (resp == 5) {
			System.out.println("Segunda.");
		} else if (resp == 6) {
			System.out.println("Segunda.");
		} else if (resp == 7) {
			System.out.println("Segunda.");
		} else {
			System.out.println("Valor inválido.");
		}
	}
}