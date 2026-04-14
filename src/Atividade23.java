import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome Pessoa 1: ");
        String nomeUm = scanner.next();

        System.out.println("Dia do Aniversário Pessoa 1");
        int diaUm = scanner.nextInt();

        System.out.println("Mês do Aniversário Pessoa 1");
        int mesUm = scanner.nextInt();

        System.out.println("=======================");

        System.out.println("Nome Pessoa 2: ");
        String nomeDois = scanner.next();

        System.out.println("Dia do Aniversário Pessoa 2");
        int diaDois = scanner.nextInt();

        System.out.println("Mês do Aniversário Pessoa 2");
        int mesDois = scanner.nextInt();


        int anoAtual = LocalDate.now().getYear();
        Month nomeMesUm = Month.of(mesUm);
        Month nomeMesDois = Month.of(mesDois);

        LocalDate niverUm = LocalDate.of(anoAtual, nomeMesUm, diaUm);
        LocalDate niverDois = LocalDate.of(anoAtual, nomeMesDois, diaDois);

        if (niverUm.isBefore(niverDois)) {
            System.out.println(nomeUm + " é o primeiro aniversariante!");
        } else if (niverDois.isBefore(niverUm)) {
            System.out.println(nomeDois + " é o primeiro aniversariante!");
        } else if (niverUm.isEqual(niverDois)) {
            System.out.printf("%s e %s fazem aniversário no mesmo dia!", nomeUm, nomeDois);
        }
    }
}
