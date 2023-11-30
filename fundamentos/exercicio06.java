package fundamentos;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respostasPositivas = 0;

        System.out.println("Responda às seguintes perguntas com 'Sim' ou 'Não'.");
        
        System.out.println("Telefonou para a vítima?");
        if (scanner.next().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.println("Esteve no local do crime?");
        if (scanner.next().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.println("Mora perto da vítima?");
        if (scanner.next().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.println("Devia para a vítima?");
        if (scanner.next().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.println("Já trabalhou com a vítima?");
        if (scanner.next().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

      
        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}
