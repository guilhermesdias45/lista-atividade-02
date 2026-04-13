import java.time.LocalDate;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento:");
        int anoNascimento = scan.nextInt();
        int dataAtual = LocalDate.now().getYear();

        System.out.printf("Você possui %d anos!%n", dataAtual-anoNascimento);
    }
}