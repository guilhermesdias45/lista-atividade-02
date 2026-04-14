import java.util.Scanner;

public class Atividade64 {
    public static void main(String[] args) {
        montarPiramide();
    }

    public static void montarPiramide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantas linhas deseja que a pirâmide tenha:");
        int linhas = scan.nextInt();

        for (int i = 0; i < linhas; i++){
            String linha = "*";
            System.out.println(linha);

            for (int j = 0; j < i; j++){
                    linha += "*";
                System.out.println(linha);
            }

            System.out.println();
        }
    }
}
