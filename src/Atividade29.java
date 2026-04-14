import java.util.Scanner;

public class Atividade29 {

    public static class Ponto {
        int x;
        int y;

        public Ponto() {}

        public Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();

        System.out.println("X do Primeiro Ponto: ");
        ponto1.setX(scanner.nextInt());

        System.out.println("Y do Primeiro Ponto: ");
        ponto1.setY(scanner.nextInt());

        System.out.println("======================");

        System.out.println("X do Segundo Ponto: ");
        ponto2.setX(scanner.nextInt());

        System.out.println("Y do Segundo Ponto: ");
        ponto2.setY(scanner.nextInt());

        System.out.println("======================");

        if (ponto1.getX() == ponto2.getX() &&
            ponto1.getY() == ponto2.getY()) {

            System.out.println("É um ponto!");

        } else if (ponto1.getX() == ponto2.getX()) {
            System.out.println("É uma Reta Vertical!");

        } else if (ponto1.getY() == ponto2.getY()) {
            System.out.println("É uma Reta Horizontal!");

        } else if (ponto1.getX() == ponto2.getY() &&
                   ponto2.getX() == ponto1.getY()){

            System.out.println("É um Quadrado!");

        } else {
            System.out.println("É um Retângulo!");

            int altura = ponto1.getY() - ponto2.getY();
            int largura = ponto2.getX() - ponto1.getX();

            System.out.println("Área: " + altura * largura);
        }

        System.out.println("======================");

        Ponto ponto3 = new Ponto();

        System.out.println("X do Terceiro Ponto: ");
        ponto3.setX(scanner.nextInt());

        System.out.println("Y do Terceiro Ponto: ");
        ponto3.setY(scanner.nextInt());

        if (ponto3.getY() > ponto1.getY() &&
                ponto3.getX() >= ponto1.getX() &&
                ponto3.getX() <= ponto2.getX()) {

            System.out.println("Acima");
        } if (ponto3.getY() > ponto1.getY() &&
                ponto3.getX() < ponto1.getX()) {

            System.out.println("Acima à esquerda");
        } if (ponto3.getY() > ponto1.getY() &&
                ponto3.getX() > ponto2.getX()) {

            System.out.println("Acima à direita");
        }

        if (ponto3.getY() < ponto2.getY() &&
                ponto3.getX() >= ponto1.getX() &&
                ponto3.getX() <= ponto2.getX()) {

            System.out.println("Embaixo");
        } if (ponto3.getY() < ponto1.getY() &&
                ponto3.getX() < ponto1.getX()) {

            System.out.println("Embaixo à esquerda");
        } if (ponto3.getY() < ponto1.getY() &&
                ponto3.getX() > ponto2.getX()) {

            System.out.println("Embaixo à diteira");
        }

        if (ponto3.getY() < ponto1.getY() && ponto3.getY() > ponto2.getY() &&
            ponto3.getX() < ponto1.getX()) {

            System.out.println("À esquerda");
        } else if (ponto3.getY() < ponto1.getY() && ponto3.getY() > ponto2.getY() &&
                ponto3.getX() > ponto2.getX()) {

            System.out.println("À direita");
        }

        if (ponto3.getY() < ponto1.getY() && ponto3.getY() > ponto2.getY() &&
            ponto3.getX() > ponto1.getX() && ponto3.getX() < ponto2.getX()) {

            System.out.println("Dentro do retângulo");
        }

        if ((ponto3.getY() == ponto1.getY() || ponto3.getY() == ponto2.getY()) &&
                (ponto3.getX() == ponto1.getX() || ponto3.getX() == ponto2.getX())) {

            System.out.println("Na linha do retângulo");
        }
    }
}