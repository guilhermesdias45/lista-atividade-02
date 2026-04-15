import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        boolean dataValida = false;
        String nomeMes = "";

        do {
            System.out.println("Informe o dia do seu nascimento: ");
            dia = scanner.nextInt();
            System.out.println("Informe o mês do seu nascimento: ");
            mes = scanner.nextInt();

            int limiteDias = 31;

            switch (mes){
                case 1: nomeMes = "Janeiro";
                    break;
                case 2: nomeMes = "Fevereiro"; limiteDias = 29;
                    break;
                case 3: nomeMes = "Março";
                    break;
                case 4: nomeMes = "Abril"; limiteDias = 30;
                    break;
                case 5: nomeMes = "Maio";
                    break;
                case 6: nomeMes = "Julho"; limiteDias = 30;
                    break;
                case 7: nomeMes = "Julho";
                    break;
                case 8: nomeMes = "Agosto";
                    break;
                case 9: nomeMes = "Setembro"; limiteDias = 30;
                    break;
                case 10: nomeMes = "Outubro";
                    break;
                case 11: nomeMes = "Novembro"; limiteDias = 30;
                    break;
                case 12: nomeMes = "Dezembro";
                    break;
                default: nomeMes = "Inválido";
                    break;
            }

            if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= limiteDias){
                System.out.println("\nResultado: A data informada está OK!");
                if(mes <= 3){
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 1° Trimestre");
                }else if(mes <= 6){
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 2° Trimestre");
                }else if(mes <= 9){
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 3° Trimestre");
                }else{
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 4° Trimestre");
                }

                dataValida = true;
            }else{
                System.out.println("Dia ou mês inválidos, digite novamente!");
            }
        } while (!dataValida);
        scanner.close();
    }
}
