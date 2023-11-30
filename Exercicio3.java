package Aula4;

public class Exercicio3 {
	public class PreencherArrays {
	    public static void main(String[] args) {
	        // a) 10 9 8 7 6 5 4 3 2 1
	        int[] arrayA = new int[10];
	        // b) 0 1 4 9 16 25 36 49 64 81
	        int[] arrayB = new int[10];
	        // c) 1 2 3 4 5 10 20 30 40 50
	        int[] arrayC = new int[10];
	        // d) 3 4 7 12 19 28 39 52 67 84
	        int[] arrayD = new int[10];

	        for (int i = 0; i < 10; i++) {
	            // a) 10 9 8 7 6 5 4 3 2 1
	            arrayA[i] = 10 - i;

	            // b) 0 1 4 9 16 25 36 49 64 81
	            arrayB[i] = i * i;

	            // c) 1 2 3 4 5 10 20 30 40 50
	            arrayC[i] = (i < 5) ? i + 1 : (i - 4) * 10;

	            // d) 3 4 7 12 19 28 39 52 67 84
	            arrayD[i] = (i == 0) ? 3 : arrayD[i - 1] + (i + 2);
	        }

	        // Imprimir os arrays
	        System.out.println("a) " + Arrays.toString(arrayA));
	        System.out.println("b) " + Arrays.toString(arrayB));
	        System.out.println("c) " + Arrays.toString(arrayC));
	        System.out.println("d) " + Arrays.toString(arrayD));
	    }
	}
