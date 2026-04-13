import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro horário (HH:MM:SS): ");
        String horario1String = scanner.next();
        LocalTime horario1 = LocalTime.parse(horario1String);

        System.out.println("Segundo horário (HH:MM:SS): ");
        String horario2String = scanner.next();
        LocalTime horario2 = LocalTime.parse(horario2String);

        Duration diferenca = Duration.between(horario1, horario2);

        System.out.println("Diferença dos horários em segundos: " + diferenca.toSeconds());
    }
}
