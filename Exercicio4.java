package Aula4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 5;

        double[] notas = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }

        double mediaTurma = somaNotas / numAlunos;

        System.out.println("A média da turma é: " + mediaTurma);

        scanner.close();
    }
}
