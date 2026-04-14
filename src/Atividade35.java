import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qtd de números para sortear: ");
        int qtd = scanner.nextInt();

        System.out.println("valor minimo do sorteio: ");
        int min = scanner.nextInt();

        System.out.println("valor maximo do sorteio: ");
        int max = scanner.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println((int) (Math.random() * (max - min)) + min );
        }
    }
}
