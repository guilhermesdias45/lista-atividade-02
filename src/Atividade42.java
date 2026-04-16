import java.util.Scanner;

public class Atividade42 {
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

        for(int i = 1; i <= 40; i++){
            int n1 = (int) (Math.random() * 60);
            int n2 = (int) (Math.random() * 60);
            int n3 = (int) (Math.random() * 60);

            if(n1 > n2){
                int aux = n1;
                n1 = n2;
                n2 = aux;
            }

            if(n1 > n3){
                int aux = n1;
                n1 = n3;
                n3 = aux;
            }

            if(n2 > n3){
                int aux = n2;
                n2 = n3;
                n3 = aux;
            }
            System.out.println("Grupo " + i + ": " + n1 + " - " + n2 + " - " + n3);
        }
        scanner.close();
    }
}
