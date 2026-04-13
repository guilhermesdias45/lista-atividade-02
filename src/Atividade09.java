import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();

        if(idade > 18){
            System.out.println("Usuário maior de idade");
        }else{
            System.out.println("Usuário menor de idade");
        }
    }
}
