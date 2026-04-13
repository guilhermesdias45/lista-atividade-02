import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numerador: ");
        int num = scanner.nextInt();

        System.out.println("Denominador: ");
        int den = scanner.nextInt();

        if (den != 0) {
            System.out.println("Resultado: " + (double) num / den);
        } else {
            System.out.println("Denominador = 0!");
        }
    }
}
