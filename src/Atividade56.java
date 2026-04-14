import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qtd de eleitores: ");
        int eleitores = scanner.nextInt();

        System.out.println("Candidato 1: ");
        String candidato1 = scanner.next();

        System.out.println("Candidato 2: ");
        String candidato2 = scanner.next();

        System.out.println("Candidato 3: ");
        String candidato3 = scanner.next();

        int v1 = 0;
        int v2 = 0;
        int v3 = 0;

        for (int i = 0; i < eleitores; i++) {
            System.out.println("seu voto (1-3): ");
            int voto = scanner.nextInt();

            if (voto == 1) v1++;
            if (voto == 2) v2++;
            if (voto == 3) v3++;

            System.out.printf("%s: %d - %.2f\n", candidato1, v1, ((double) v1/(v1+v2+v3)*100));
            System.out.printf("%s: %d - %.2f\n", candidato2, v2, ((double) v2/(v1+v2+v3)*100));
            System.out.printf("%s: %d - %.2f\n", candidato3, v3, ((double) v3/(v1+v2+v3)*100));
        }

        List<String> candidatos = Arrays.asList(candidato1, candidato2, candidato3);
        List<Integer> votos = Arrays.asList(v1, v2, v3);
        Integer idxGanhador = votos.indexOf(Collections.max(votos));

        System.out.println("Ganhador: " + candidatos.get(idxGanhador));
    }
}
