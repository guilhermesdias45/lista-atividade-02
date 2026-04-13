import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Você ganha " + salario / salarioMinimo + " salários mínimos!");
    }
}
