import java.util.Scanner;

public class Atividade55 {
    public static void main(String[] args) {
        calcularValorLigacoes();
    }

    public static void calcularValorLigacoes(){
        Scanner scan = new Scanner(System.in);

        double valorTotal = 50.0;
        int minutosPlano = 100;
        int minutosPlanoVaiVai = 50;

        char validacao = 's';
        do {
            System.out.println("""
                    Qual tipo de ligação deseja fazer?
                    'o' - Outras Operadoras
                    'v' - Vai-Vai
                    'f' - Telefone Fixo
                    """);
            String input = scan.next();
            char opcao = input.charAt(0);
            if (multiplicarTipoLigacao(opcao) != 0){
                System.out.println("Quantos minutos de duração?");
                int minutos = scan.nextInt();

                if (opcao == 'v' && minutosPlanoVaiVai > 0){
                    if ((minutosPlanoVaiVai - minutos) < 0){
                        if ((minutosPlanoVaiVai + minutosPlano) - minutos < 0){
                            valorTotal += minutos * multiplicarTipoLigacao(opcao);
                            minutosPlano = 0;
                            minutosPlanoVaiVai = 0;
                        } else {
                            minutosPlano -= (minutosPlanoVaiVai + minutosPlano) - minutos;
                            minutosPlanoVaiVai = 0;
                        }
                    } else {
                        minutosPlanoVaiVai -= minutos;
                    }
                } else {
                    if (minutosPlano > 0){
                        if ((minutosPlano - minutos) < 0){
                            minutos -= minutosPlano;
                            minutosPlano = 0;
                            valorTotal += minutos * multiplicarTipoLigacao(opcao);
                        } else {
                            minutosPlano -= minutos;
                        }
                    }
                }
                System.out.printf("""
                    ****************************************************
                    Valor Total no mês: %.2f
                    Saldo Minutos do Plano: %d
                    Saldo Minutos para Ligação de Número Vai-Vai: %d
                    ****************************************************
                    
                    """, valorTotal, minutosPlano, minutosPlanoVaiVai);

                System.out.println("Deseja fazer outras ligações? (sim/não)");
                String input02 = scan.next();
                validacao = input02.charAt(0);
            } else {
                System.out.println("""
                        Opção inválida! Informe uma opção informada no menu.
                        """);
            }

        } while(validacao != 'n' && validacao != 'N');

        System.out.println("""
                ****************************************************
                                Encerrando Aplicação
                ****************************************************
                """);
    }

    public static double multiplicarTipoLigacao(char x){
        if (x == 'o' || x == 'O'){
            return 0.65;
        } else if (x == 'v' || x == 'V') {
            return 0.2;
        } else if (x == 'f' || x == 'F') {
            return 0.5;
        }
        return 0.0;
    }
}
