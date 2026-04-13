import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome Pessoa 1: ");
        String nome1 = scanner.next();

        System.out.println("Idade Pessoa 1: ");
        int idade1 = scanner.nextInt();

        System.out.println("Nome Pessoa 2: ");
        String nome2 = scanner.next();

        System.out.println("Idade Pessoa 2: ");
        int idade2 = scanner.nextInt();

        if (idade1 > idade2) {
            System.out.printf("""
                    Pessoa mais nova: %s
                    Pessoa mais velha: %s
                    """, nome2, nome1);
        } else if (idade2 > idade1) {
            System.out.printf("""
                    Pessoa mais nova: %s
                    Pessoa mais velha: %s
                    """, nome1, nome2);
        } else {
            System.out.println("Idades iguais!");
        }
    }
}
