import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaMinima = 7.5;
        double frequenciaMinima = 75.0;
        int totalAulas = 0;

        System.out.println("Digite a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double somarNotas = 0;
        double media = 0;

        for(int i = 1; i <= qtdNotas; i++){
            System.out.println("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somarNotas = somarNotas + nota;
        }

        media = somarNotas/qtdNotas;

        System.out.println("Digite o total de aulas no semetre");
        totalAulas = scanner.nextInt();

        System.out.println("Digite a quantidade de faltas");
        int faltas = scanner.nextInt();

        int presenca = totalAulas - faltas;
        double frequencia = (presenca * 100.0) / totalAulas;

        if(frequencia < frequenciaMinima){
            System.out.println("Reprovado por faltas");
        }else if (media >= mediaMinima) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado por nota");;
        }


        System.out.println("Media final: " + media);
        System.out.println("Frequencia: " + frequencia);

        scanner.close();
    }
}
