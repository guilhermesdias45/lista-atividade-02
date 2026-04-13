import java.time.LocalTime;

public class Atividade25 {
    public static void main(String[] args) {
        LocalTime tempoAtual = LocalTime.now();

        System.out.println(tempoAtual);
        System.out.printf("Agora são %d horas, %d minutos e %d segundos%n",
                tempoAtual.getHour(),
                tempoAtual.getMinute(),
                tempoAtual.getSecond());
    }
}
