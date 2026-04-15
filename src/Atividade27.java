import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite o ultimo numero");
        int n3 = scanner.nextInt();

        if(n1 == n2 && n2 == n3){
            System.out.println("Os numeros são iguais");
        }else{
            double maior = n1;

            if(n2 > maior){
                maior = n2;
            }
            if(n3 > maior){
                maior = n3;
            }

            System.out.println("O maior numero é: " + maior);
        }
        scanner.close();
    }
}
