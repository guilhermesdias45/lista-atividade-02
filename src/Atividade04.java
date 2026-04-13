import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe suas 4 notas:");

        double somaNotas = 0;
        int qtdNotas = 4;
        for (int i = 0; i < qtdNotas; i++){
            System.out.println(String.format("Nota %d:", i+1));
            somaNotas += scan.nextDouble();
        }

        System.out.println("Sua média aritmética é: " + somaNotas/qtdNotas);
    }
}
