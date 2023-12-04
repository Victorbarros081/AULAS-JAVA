package atividadestr;

public class atv05 {
    String texto01 = "Será que são iguais?";
    String texto02 = "Será que são iguais?";

    public void compararTextos() {
        boolean saoIguais = texto01.equals(texto02);
        System.out.println("Os textos são iguais? " + saoIguais);
    }

    public static void main(String[] args) {
        atv05 atividade = new atv05();
        atividade.compararTextos();
    }
}
