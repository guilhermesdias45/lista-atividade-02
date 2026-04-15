
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes:");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        int limiteDias = 31;
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if(mes == 4 || mes == 6 || mes == 9 || mes == 1){
            limiteDias = 30;
        }else if(mes == 2){
            limiteDias = bissexto ? 29 : 28;
        }

        if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= limiteDias){
            System.out.println("A data " + dia + "/" + mes + "/" + ano +" é valida!");
            if(bissexto){
                System.out.println("O ano é bissexto!");
            }else{
                System.out.println("O ano não é bissexto!");
            }
        }
        scanner.close();
    }
}
