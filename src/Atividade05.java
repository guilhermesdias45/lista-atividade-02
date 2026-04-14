import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor inicial do débito: ");
        double debito = scanner.nextDouble();

        System.out.println("Quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.println("Juros mensais: ");
        double juros = scanner.nextDouble();

        double total = (debito * (juros / 100) * meses) + debito;
        System.out.println("Valor final: " + total);
    }
}
