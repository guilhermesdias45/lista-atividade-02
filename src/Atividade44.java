import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdValores = scan.nextInt();

        mediaAritmetica(qtdValores);
    }

    public static void mediaAritmetica(int qtdNumeros){
        Scanner scan = new Scanner(System.in);

        double somaNumeros = 0;
        for (int i = 0; i < qtdNumeros; i++){
            System.out.printf("Informe o número %d:%n",(i+1));
            int numero = scan.nextInt();
            somaNumeros += numero;
        }

        System.out.printf("Média aritmética: %.2f", somaNumeros/qtdNumeros);
    }
}
