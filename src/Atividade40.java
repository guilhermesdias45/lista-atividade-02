import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        gerenciarIdades();
    }

    public static void gerenciarIdades(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantas pessoas possuem no grupo:");

        int qtdPessoas = scan.nextInt();
        int somaIdades = 0;
        int maiorIdade = 0;
        int menorIdade = 999;
        int contadorMaiorIdade = 0;

        for (int i = 0; i < qtdPessoas; i++){
            System.out.printf("Informe a idade da %d pessoa:%n",(i+1));
            int idadePessoa = scan.nextInt();

            if (idadePessoa >= 18){
                contadorMaiorIdade++;
            }
            if (idadePessoa > maiorIdade){
                maiorIdade = idadePessoa;
            }
            if (idadePessoa < menorIdade){
                menorIdade = idadePessoa;
            }
            somaIdades+= idadePessoa;
        }

        System.out.printf("""
                        A média de idade das pessoas é %.2f
                        A maior idade é %d
                        A menor idade é %d
                        A quantidade de pessoas maior de idade é %d
                        %n""",
                (double)somaIdades/qtdPessoas,
                maiorIdade,
                menorIdade,
                contadorMaiorIdade);
    }
}
