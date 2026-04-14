import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade65 {
    public static void main(String[] args) {
        montarPiramideEquilatero();
    }

    public static void montarPiramideEquilatero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantas linhas deseja que a pirâmide tenha:");
        int linhas = scan.nextInt();

        List<String> linhasArmazenadas = new ArrayList<>();

        for (int i = 0; i < linhas; i++){
            String linha = "";

            int logica = (linhas-(i+1)/2);

            for (int k = 0; k < logica; k++){
                linha += " ";
            }

            linha += "*";
            for (int j = 0; j < i; j++){
                linha += "*";
            }

            System.out.println(linha);
        }
    }
}
