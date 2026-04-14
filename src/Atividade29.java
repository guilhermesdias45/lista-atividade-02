import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("X do Primeiro Ponto: ");
        int x1 = scanner.nextInt();

        System.out.println("Y do Primeiro Ponto: ");
        int y1 = scanner.nextInt();

        System.out.println("======================");

        System.out.println("X do Segundo Ponto: ");
        int x2 = scanner.nextInt();

        System.out.println("Y do Segundo Ponto: ");
        int y2 = scanner.nextInt();

        System.out.println("======================");

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto!");

        } else if (x1 == x2) {
            System.out.println("É uma Reta Vertical!");

        } else if (y1 == y2) {
            System.out.println("É uma Reta Horizontal!");

        } else if (x1 == y2 && x2 == y1){
            System.out.println("É um Quadrado!");

        } else {
            System.out.println("É um Retângulo!");

        }
    }
}