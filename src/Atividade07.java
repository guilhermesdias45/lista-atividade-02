import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quanto o cliente gastou no restaurante:");
        double valorGasto = scan.nextDouble();

        System.out.println(String.format("A comissão do garçom será de R$%.2f.", valorGasto * 0.1));
    }
}
