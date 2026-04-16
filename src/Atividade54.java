import java.util.Scanner;

public class Atividade54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Digite o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.println("Digite o valor do incremento: ");
        double incremento = scanner.nextDouble();

        System.out.println("Digite o valor de 1 dolar em reais: ");
        double valorDolar = scanner.nextDouble();

        for(double reais = valorInicial; reais <= valorFinal; reais = reais + incremento){
            double dolares = reais / valorDolar;
            System.out.printf("R$ %.2f\t\tUS$ %.2f%n", reais, dolares);
        }
        scanner.close();
    }
}
