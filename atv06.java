package atividadestr;

import java.util.Scanner;

public class atv06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String textoMaiusculo = texto.toUpperCase();

        System.out.println("Texto em maiúsculas: " + textoMaiusculo);

        scanner.close();
    }
}



  