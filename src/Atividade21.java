import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cargo: ");
        String cargo = scanner.next();

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        switch (cargo) {
            case "Diretoria":
                System.out.println("Valor do empréstimo: " + (salario * 0.30));
                break;
            case "Gerência":
                System.out.println("Valor do empréstimo: " + (salario * 0.25));
                break;
            case "Operacional":
                System.out.println("Valor do empréstimo: " + (salario * 0.20));
                break;
            default:
                System.out.println("Cargo inválido!");
                break;
        }
    }
}
