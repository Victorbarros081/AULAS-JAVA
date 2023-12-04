package atividadestr;

public class atv08 {

	public static void main(String[] args) {
		
		 String[] arrayTexto = {"a", "vida", "é", "bela"};

		 StringBuilder textoFormatado = new StringBuilder();

		 for (int i = arrayTexto.length - 1; i >= 0; i--) {
		      String palavra = arrayTexto[i];

		     if (!palavra.isEmpty()) {
		    	 
		          textoFormatado.append(palavra).append(" ");
		            }
		        }

		        System.out.println(textoFormatado.toString().trim());
		    }
		

		    }
		

	
		


