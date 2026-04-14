import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {
        determinarMaioresDeIdade();
    }

    public static void determinarMaioresDeIdade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("A lista possui 200 pessoas. Quantas delas serão mulheres? (Considere que as demais pessoas serão homens)");
        int mulheres = scan.nextInt();

        int maiorIdadeMulher = 0;
        int maiorIdadeHomem = 0;
        for (int i = 0; i < mulheres; i++){
            System.out.printf("Informe a idade da %dº mulher:%n", (i+1));
            int idadeMulher = scan.nextInt();
            if (idadeMulher >= 18){
                maiorIdadeMulher++;
            }
        }
        for (int i = 0; i < 200 - mulheres; i++){
            System.out.printf("Informe a idade do %dº homem:%n", (i+1));
            int idadeHomem = scan.nextInt();
            if (idadeHomem >= 18){
                maiorIdadeHomem++;
            }
        }

        System.out.printf("A lista possui 200 pessoas, sendo que %d delas são mulheres maiores de idade e %d são homens maiores de idade.%n", maiorIdadeMulher, maiorIdadeHomem);
    }
}
