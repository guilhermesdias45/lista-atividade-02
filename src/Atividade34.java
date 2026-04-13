public class Atividade34 {
    public static void main(String[] args) {
        sortearNumero(50);
    }

    public static void sortearNumero(int qtdNumeros){

        for (int i = 0; i < qtdNumeros; i++){
            int numero = (int) (Math.random() * 100) + 1;

            System.out.println(numero);
        }
    }
}
