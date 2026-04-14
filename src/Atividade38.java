public class Atividade38 {
    public static void main(String[] args) {

        int numero = 11;
        boolean ePrimo = true;

        for (int i = 1; i < numero; i++) {
            if (((numero % i) == 0) && (i != 1) && (i != numero)) {
                ePrimo = false;
            }
        }

        System.out.println(ePrimo ? "é primo" : "não é primo");
    }
}
