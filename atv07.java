package atividadestr;

public class atv07 {

	public static void main(String[] args) {
		String[] arrayTexto = {"a", "vida", "é", "bela"};

        StringBuilder textoFormatado = new StringBuilder();

        for (String palavra : arrayTexto) {
            if (!palavra.isEmpty()) {
                String palavraFormatada = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();

                textoFormatado.append(palavraFormatada).append(" ");
            }
        }

        System.out.println(textoFormatado.toString().trim());

	}

}








