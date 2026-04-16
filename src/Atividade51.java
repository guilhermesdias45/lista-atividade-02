import java.util.Scanner;

public class Atividade51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;
        int c = 2;

        if(n >= 1){
            System.out.println(a);
        }

        if(n >= 2){
            System.out.println(" " + b);
        }

        if(n >= 3){
            System.out.println(" " + c);
        }

        for(int i = 4; i <= n; i++){
            int proximo = a + b +c;
            System.out.println(" " + proximo);

            a = b;
            b = c;
            c = proximo;
        }
        scanner.close();
    }
}
