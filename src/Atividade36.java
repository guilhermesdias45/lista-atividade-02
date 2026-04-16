import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.println("Informe o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = scanner.nextInt();

        int inicio;
        int fim;

        if(n1 < n2){
            inicio = n1;
            fim = n2;
        }else{
            inicio = n2;
            fim = n1;
        }

        System.out.println("Numeros ímpares entre " + inicio + " e " + fim );


        for(int i = inicio; i <= fim; i++){
            if(i % 2 != 0){
                System.out.println(i + "");
            }
        }
        scanner.close();
    }
}
