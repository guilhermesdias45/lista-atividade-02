import java.math.BigInteger;

public class Atividade52 {
    public static void main(String[] args) {
        sacosDeArroz();
    }

    public static void sacosDeArroz(){
        BigInteger numero = BigInteger.ONE;
        BigInteger somaTotal = BigInteger.ONE;
        for (int i = 0; i < 64; i++){
            numero = numero.multiply(BigInteger.valueOf(2));
            somaTotal = somaTotal.add(numero);
        }

        System.out.println("A quantia de grãos de arroz que devem ser entregues para o súdito é: " + somaTotal);

        System.out.println("A quantia de sacos de arroz é: " + somaTotal.divide(BigInteger.valueOf(64)));
    }
}
