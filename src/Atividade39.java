import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero para verificar se é perfeito");
        int numero = scanner.nextInt();

        if(numero <= 0){
            System.out.println("Informe outro numero");
        }else{
            int somaDivisores = 0;

            for(int i = 1; i <= numero/2; i++){
                if(numero % i == 0){
                    somaDivisores += i;
                }
            }

            if(somaDivisores == numero){
                System.out.println(numero + " é um numero perfeito");
            }else{
                System.out.println(numero + " não é um numero perfeito");
            }
        }

        scanner.close();
    }
}
