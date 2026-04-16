import java.util.Scanner;

public class Atividade45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        int soma = 0;

        for(int i = 1; i <= 100; i++){
            System.out.println("Informe o " + (i) + "° número: ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];
        }
            System.out.println("a soma de todos os numeros informados : " + soma);

    }
}
