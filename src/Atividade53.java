import java.util.Scanner;

public class Atividade53 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n*i));
        }
    }
}
