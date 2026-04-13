public class Atividade37 {
    public static void main(String[] args) {
        calcularFatorial(7);
    }

    public static void calcularFatorial(int numero){
        int somaNumero = numero;

        for (int i = --numero; i > 0; i--){
            somaNumero*=i;
        }

        System.out.println(somaNumero);
    }
}
