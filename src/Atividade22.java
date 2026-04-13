import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira data: (Ex.: 19/04)");
        String data01 = scan.nextLine();

        System.out.println("Informe a primeira data: (Ex.: 19/04)");
        String data02 = scan.nextLine();

        String comparacao = (data01.equals(data02)) ? "As datas são iguais!" : "As datas não são iguais!";
        System.out.println(comparacao);
    }
}
