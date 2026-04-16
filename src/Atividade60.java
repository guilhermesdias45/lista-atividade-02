import java.util.Scanner;

public class Atividade60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
                "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        System.out.println("Digite o valor da divida: R$");
        double divida = scanner.nextDouble();

        System.out.println("Digite a taxa de correção mensal: (%): ");
        double taxa = scanner.nextDouble();

        System.out.println("Digite a quantidade de anos: ");
        int qtdAnos = scanner.nextInt();

        double valorAtual = divida;
        int anoIncial = 2007;

        System.out.printf("%-6s", "Ano");
        for(String mes : meses){
            System.out.printf("%10s", mes);
        }
        System.out.println();

        for(int i = 0; i <qtdAnos; i++){
            System.out.printf("%-6d", anoIncial + i);

            for(int j = 0; j < 12; j++){
                System.out.printf("%10.2f", valorAtual);
                valorAtual += valorAtual * (taxa / 100);
            }
            System.out.println();
        }

        scanner.close();
    }
}
