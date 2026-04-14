import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean ganhou = false;
        int tentativas = 0;
        int sorteado = (int) (Math.random() * (100 - 1)) + 1;

        do {
            System.out.print("aposta: ");
            int numero = scanner.nextInt();

            if (numero == sorteado) {
                ganhou = true;
                System.out.println("ganhou");
            } else if (numero < sorteado) {
                System.out.println("é maior");
            } else if (numero > sorteado) {
                System.out.println("é menor");
            } else {
                System.out.println("invalido");
            }

            tentativas++;
        } while (!ganhou);
    }
}
