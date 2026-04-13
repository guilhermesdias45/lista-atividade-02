import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int homens = 0;
        int mulheres = 0;

        System.out.println("Informe a quantidade de homens: ");
        homens = scanner.nextInt();
        System.out.println("Informe a quantidade de mulheres");
        mulheres = scanner.nextInt();

        int total = homens + mulheres;
        double porcentagemH = (double) (homens * 100) / total ;
        System.out.println(porcentagemH + "% homens");
        double porcentagemM = (double) (mulheres * 100) / total ;
        System.out.println(porcentagemM + "% mulheres");
    }
}
