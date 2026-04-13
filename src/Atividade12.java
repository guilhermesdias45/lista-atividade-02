import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe suas 3 notas:");

        double somaNotas = 0;
        int qtdNotas = 3;
        for (int i = 0; i < qtdNotas; i++){
            System.out.printf("Nota %d:%n", i+1);
            somaNotas += scan.nextDouble();
        }
        double media = somaNotas/qtdNotas;
        String resultado;
        if (media >= 7){
            resultado = "Aluno aprovado!";
        } else if (media >= 5) {
            resultado = "Aluno ficou de recuperação.";
        } else {
            resultado = "Aluno reprovado!";
        }

        System.out.println(resultado);
    }
}
