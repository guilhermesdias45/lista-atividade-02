import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int opcao = 1;

        do {
            System.out.println("Informe o dia do seu nascimento: ");
            dia = scanner.nextInt();
            System.out.println("Informe o mês do seu nascimento: ");
            mes = scanner.nextInt();

            String entrada = scanner.nextLine();

            if (dia < 0 && mes > 12) {
                if(mes == 4){

                }
                System.out.println("Dia ou mês informado estão incorretos. Digite 0 para sair");
                opcao = Integer.parseInt(scanner.nextLine());
            }
        } while (opcao == 0);


        scanner.close();
    }
}
