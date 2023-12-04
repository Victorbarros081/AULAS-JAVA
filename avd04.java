package atividadestr;
import java.util.Scanner;

public class avd04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine().trim();

        scanner.close();

        if (texto.isEmpty()) {
            System.out.println("O texto está vazio.");
        } else {
            String[] palavras = texto.split("\\s+");
            int numeroPalavras = palavras.length;

            System.out.println("Número de palavras: " + numeroPalavras);
        }
    }
}
