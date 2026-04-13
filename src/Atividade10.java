import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salário bruto:");
        double salarioBruto = scan.nextDouble();

        System.out.println("Informe o valor dos descontos:");
        double descontos = scan.nextDouble();

        System.out.println("Informe o valor do possível empréstimo:");
        double valorEmprestimo = scan.nextDouble();

        double emprestimoLimite = (salarioBruto - descontos) * 0.3;
        String permissaoEmprestimo = (emprestimoLimite >= valorEmprestimo) ? "Você poderá fazer esse empréstimo!" : "Você não poderá fazer esse empréstimo!";

        System.out.println(permissaoEmprestimo);
    }
}
