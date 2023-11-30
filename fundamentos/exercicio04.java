package fundamentos;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();


        double media = (nota1 + nota2) / 2;

     
        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}
