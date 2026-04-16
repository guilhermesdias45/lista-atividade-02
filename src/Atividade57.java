import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Atividade57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data:");
        System.out.println("Dia: ");
        int dia1 = scanner.nextInt();
        System.out.println("Mês: ");
        int mes1 = scanner.nextInt();
        System.out.println("Ano: ");
        int ano1 = scanner.nextInt();

        System.out.println("Digite a segunda data:");
        System.out.println("Dia: ");
        int dia2 = scanner.nextInt();
        System.out.println("Mês: ");
        int mes2 = scanner.nextInt();
        System.out.println("Ano: ");
        int ano2 = scanner.nextInt();

       int dia = dia1;
       int mes = mes1;
       int ano = ano1;

       while (ano < ano2 || (ano == ano2 && mes < mes2) ||
              ano == ano2 && mes == mes2 && dia <= dia2){
           System.out.println(dia + "/" + mes + "/" + ano);
           int diasNoMes;

           if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
               diasNoMes = 30;
           }else if(mes == 2){
               if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                diasNoMes = 29;
               }else{
                   diasNoMes = 28;
               }
           }else{
               diasNoMes = 31;
           }
           dia++;
           if(dia > diasNoMes){
               dia = 1;
               mes++;
           }

           if(mes > 12){
               mes = 1;
               ano++;
           }
       }

       scanner.close();
    }
}
