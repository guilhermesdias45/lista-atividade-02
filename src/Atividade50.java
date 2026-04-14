import java.util.Scanner;

public class Atividade50 {

    public  static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return  (fibonacci(n - 1)) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
}
