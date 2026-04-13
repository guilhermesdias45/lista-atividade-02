import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 2 números:");
        System.out.println("Número 1:");
        int n1 = scan.nextInt();

        System.out.println("Número 2:");
        int n2 = scan.nextInt();

        String resultado = (n1 < n2) ? n1 + " " + n2 : n2 + " " + n1;
        System.out.println(resultado);
    }
}
