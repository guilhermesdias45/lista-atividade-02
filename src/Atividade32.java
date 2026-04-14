public class Atividade32 {
    public static void main(String[] args) {

        StringBuilder linha = new StringBuilder();

        for (int i = 1; i <= 500; i++) {
            linha.append(" ").append(i);
        }

        System.out.println(linha.toString());
    }
}
