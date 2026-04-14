import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {
        montarPiramideNumerosEmColuna();
    }

    public static void montarPiramideNumerosEmColuna(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantas linhas deseja que a pirâmide tenha:");
        int linhas = scan.nextInt();

        for (int i = 0; i <= linhas; i++){
            String linha = "";
            for (int j = 0; j < i; j++){
                linha += String.format("%02d ", (j+1));
            }
            System.out.println(linha);
        }
    }
}
