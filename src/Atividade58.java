import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {
        somarData();
    }

    public static void somarData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma data: (Ex.: 13/04/2026)");
        String dataInformada = scan.nextLine();

        System.out.println("Informe uma quantidade de dias para somar:");
        int diasInformado = scan.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataInformada, formatter);

        data = data.plusDays(diasInformado);

        System.out.println("Nova data: " + data.format(formatter));
//        t
    }
}
