package jogodaforca;

import java.util.Scanner;

public class atividadejogodaforca {
    public static void main(String[] args) {
        
        String[] palavras = {"SPORT", "BARCELONA", "ARSENAL", "PALMEIRAS"};

        
        String palavraEscolhida = palavras[(int) (Math.random() * palavras.length)];
        char[] letrasPalavra = palavraEscolhida.toCharArray();
        char[] letrasDescobertas = new char[letrasPalavra.length];

        
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);
        int tentativasRestantes = 6; 

        while (tentativasRestantes > 0) {
           
            System.out.print("Palavra: ");
            for (char letra : letrasDescobertas) {
                System.out.print(letra + " ");
            }
            System.out.println();

            
            System.out.print("Digite uma letra: ");
            char tentativa = scanner.next().toUpperCase().charAt(0);

           
            boolean letraEncontrada = false;
            for (int i = 0; i < letrasPalavra.length; i++) {
                if (letrasPalavra[i] == tentativa) {
                    letrasDescobertas[i] = tentativa;
                    letraEncontrada = true;
                }
            }

            
            if (!letraEncontrada) {
                tentativasRestantes--;
                System.out.println("Letra não encontrada. Tentativas restantes: " + tentativasRestantes);
            }

           
            if (String.valueOf(letrasDescobertas).equals(palavraEscolhida)) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavraEscolhida);
                break;
            }
        }

        
        if (tentativasRestantes == 0) {
            System.out.println("Game over! A palavra era: " + palavraEscolhida);
        }

        scanner.close();
    }
}



