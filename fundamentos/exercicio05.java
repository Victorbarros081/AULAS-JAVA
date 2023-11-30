package fundamentos;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra (F ou M): ");
        char letra = scanner.next().charAt(0);

        // Verifica o gênero
        if (letra == 'F' || letra == 'f') {
            System.out.println("Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra inválida. Digite F ou M.");
        }

        scanner.close();
    }
}
