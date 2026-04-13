public class Atividade28 {
    public static void main(String[] args) {
        organizarNumeros(8,5,4);
    }

    public static void organizarNumeros(int n1, int n2, int n3){
        int armazena;
        if (n1 > n2){
            armazena = n1;
            n1 = n2;
            n2 = armazena;
        }
        if (n1 > n3){
            armazena = n1;
            n1 = n3;
            n3 = armazena;
        }
        if (n2 > n3){
            armazena = n2;
            n2 = n3;
            n3 = armazena;
        }

        System.out.printf("%d %d %d%n",n1,n2,n3);
    }
}
