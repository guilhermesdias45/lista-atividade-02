import java.util.ArrayList;
import java.util.List;

public class Atividade49 {
    public static void main(String[] args) {
        encontrarNumerosFibonacci();
    }

    public static void encontrarNumerosFibonacci(){
        List<Long> listaFibonacci = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            if (listaFibonacci.size() >= 2){
                Long novoNumero = listaFibonacci.get(i-2) + listaFibonacci.get(i-1);
                listaFibonacci.add(novoNumero);
            } else {
                listaFibonacci.add(1L);
            }
        }

        System.out.println(listaFibonacci);
    }
}
