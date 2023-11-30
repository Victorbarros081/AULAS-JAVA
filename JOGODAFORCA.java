package ;

import java.util.Scanner;

public class JOGODAFORCA {

    public static void main(String[] args) {
        String palavraChave = "carambola";
        String letrasUsadas = "";
        StringBuilder palavraAdivinhada = new StringBuilder("_".repeat(palavraChave.length()));
        int tentativas_MAX = 8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo da forca");
        System.out.println("Sua tarefa é adivinhar a palavra escondida. Boa sorte!");

        for (int tentativas = 0; tentativas < tentativas_MAX; tentativas++) {
            System.out.printf("Rodada %d. Até agora adivinhada: %s. Qual a letra?%n", tentativas + 1, palavraAdivinhada);

            char letraTentada;
            do {
                System.out.print("Digite uma letra: ");
                letraTentada = scanner.next().toLowerCase().charAt(0);
            } while (!Character.isLetter(letraTentada) || letrasUsadas.contains(String.valueOf(letraTentada)));

            letrasUsadas += letraTentada;

            if (palavraChave.indexOf(letraTentada) >= 0) {
                for (int j = 0; j < palavraChave.length(); j++) {
                    if (letrasUsadas.indexOf(palavraChave.charAt(j)) >= 0) {
                        palavraAdivinhada.setCharAt(j, palavraChave.charAt(j));
                    }
                }

                if (!palavraAdivinhada.toString().contains("_")) {
                    System.out.printf("Parabéns! A palavra adivinhada era '%s'%n", palavraAdivinhada);
                    System.exit(0);
                } else {
                    System.out.printf("Muito bom ^_^ ! %c existe na palavra. Ainda tem letras escondidas%n", letraTentada);
                }
            } else {
                System.out.printf("Infelizmente a letra %c não existe na palavra.%n ", letraTentada);
            }
        }

        System.out.printf("Foram %d tentativas... x_x A palavra era '%s'%n", tentativas_MAX, palavraChave);

        scanner.close();
    }
}


