import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int anoNasc = 0;
        int diaHoje = 0;
        int mesHoje = 0;
        int anoHoje = 0;
        boolean dataValida = false;
        String nomeMes = "";

        do {
            System.out.println("Informe o dia do seu nascimento: ");
            dia = scanner.nextInt();
            System.out.println("Informe o mês do seu nascimento: ");
            mes = scanner.nextInt();
            System.out.println("Informe o ano que você nasceu: ");
            anoNasc = scanner.nextInt();

            System.out.println("Dia de hoje: ");
            diaHoje = scanner.nextInt();
            System.out.println("Mês atual: ");
            mesHoje = scanner.nextInt();
            System.out.println("Ano atual: ");
            anoHoje = scanner.nextInt();

            int limiteDias = 31;
            switch (mes) {
                case 1:
                    nomeMes = "Janeiro";
                    break;
                case 2:
                    nomeMes = "Fevereiro";
                    limiteDias = 29;
                    break;
                case 3:
                    nomeMes = "Março";
                    break;
                case 4:
                    nomeMes = "Abril";
                    limiteDias = 30;
                    break;
                case 5:
                    nomeMes = "Maio";
                    break;
                case 6:
                    nomeMes = "Julho";
                    limiteDias = 30;
                    break;
                case 7:
                    nomeMes = "Julho";
                    break;
                case 8:
                    nomeMes = "Agosto";
                    break;
                case 9:
                    nomeMes = "Setembro";
                    limiteDias = 30;
                    break;
                case 10:
                    nomeMes = "Outubro";
                    break;
                case 11:
                    nomeMes = "Novembro";
                    limiteDias = 30;
                    break;
                case 12:
                    nomeMes = "Dezembro";
                    break;
                default:
                    nomeMes = "Inválido";
                    break;
            }

            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= limiteDias) {
                System.out.println("\nResultado: A data informada está OK!");
                if (mes <= 3) {
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 1° Trimestre");
                } else if (mes <= 6) {
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 2° Trimestre");
                } else if (mes <= 9) {
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 3° Trimestre");
                } else {
                    System.out.println("Você nasceu dia: " + dia + " do mês de: " + nomeMes + " no 4° Trimestre");
                }

                String signo = "";

                if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)){
                    signo = "Áries";
                }else if((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)){
                    signo = "Touro";
                }else if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)){
                    signo = "Gêmeos";
                }else if((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)){
                    signo = "Câncer";
                }else if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)){
                    signo = "Leão";
                }else if((mes == 8 && dia >=23) || (mes == 9 && dia <= 22)){
                    signo = "Virgem";
                } else if((mes == 9 && dia >= 23) || (mes == 10 && dia <=22)){
                    signo = "Libra";
                }else if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){
                    signo = "Escopião";
                }else if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){
                    signo = "Sargitario";
                }else if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)){
                    signo = "Capricórnio";
                }else if((mes == 1 && dia >= 20 ) || (mes == 2 && dia <= 18)){
                    signo = "Aquário";
                }else{
                    signo = "Peixes";
                }
                System.out.println("Seu signo é: " + signo);

                int idade = anoHoje - anoNasc;

                if(mesHoje < mes || (mesHoje == mes && diaHoje < dia)){
                    idade--;
                }

                System.out.println("Sua idade atual é: " + idade + " anos");
                dataValida = true;
            } else {
                System.out.println("Dia ou mês inválidos, digite novamente!");
            }
        } while (!dataValida);
        scanner.close();
    }
}
