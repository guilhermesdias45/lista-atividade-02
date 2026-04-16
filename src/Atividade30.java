import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3, x4, y4;
        int x5, y5, x6, y6, x7, y7, x8, y8;

        System.out.println("Retangulo 1");
        System.out.print("Ponto 1 (x y): ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.print("Ponto 2 (x y): ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.print("Ponto 3 (x y): ");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        System.out.print("Ponto 4 (x y): ");
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();

        System.out.println("Retangulo 2");
        System.out.print("Ponto 1 (x y): ");
        x5 = scanner.nextInt();
        y5 = scanner.nextInt();

        System.out.print("Ponto 2 (x y): ");
        x6 = scanner.nextInt();
        y6 = scanner.nextInt();

        System.out.print("Ponto 3 (x y): ");
        x7 = scanner.nextInt();
        y7 = scanner.nextInt();

        System.out.print("Ponto 4 (x y): ");
        x8 = scanner.nextInt();
        y8 = scanner.nextInt();

        boolean repetido1 =
                (x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x1 == x4 && y1 == y4) ||
                        (x2 == x3 && y2 == y3) || (x2 == x4 && y2 == y4) ||
                        (x3 == x4 && y3 == y4);

        boolean repetido2 =
                (x5 == x6 && y5 == y6) || (x5 == x7 && y5 == y7) || (x5 == x8 && y5 == y8) ||
                        (x6 == x7 && y6 == y7) || (x6 == x8 && y6 == y8) ||
                        (x7 == x8 && y7 == y8);

        if (repetido1 || repetido2) {
            System.out.println("Ha pontos sobrepostos. Retangulo invalido.");
        } else {
            int menorX1 = x1;
            int maiorX1 = x1;
            int menorY1 = y1;
            int maiorY1 = y1;

            if (x2 < menorX1) menorX1 = x2;
            if (x3 < menorX1) menorX1 = x3;
            if (x4 < menorX1) menorX1 = x4;

            if (x2 > maiorX1) maiorX1 = x2;
            if (x3 > maiorX1) maiorX1 = x3;
            if (x4 > maiorX1) maiorX1 = x4;

            if (y2 < menorY1) menorY1 = y2;
            if (y3 < menorY1) menorY1 = y3;
            if (y4 < menorY1) menorY1 = y4;

            if (y2 > maiorY1) maiorY1 = y2;
            if (y3 > maiorY1) maiorY1 = y3;
            if (y4 > maiorY1) maiorY1 = y4;

            int menorX2 = x5;
            int maiorX2 = x5;
            int menorY2 = y5;
            int maiorY2 = y5;

            if (x6 < menorX2) menorX2 = x6;
            if (x7 < menorX2) menorX2 = x7;
            if (x8 < menorX2) menorX2 = x8;

            if (x6 > maiorX2) maiorX2 = x6;
            if (x7 > maiorX2) maiorX2 = x7;
            if (x8 > maiorX2) maiorX2 = x8;

            if (y6 < menorY2) menorY2 = y6;
            if (y7 < menorY2) menorY2 = y7;
            if (y8 < menorY2) menorY2 = y8;

            if (y6 > maiorY2) maiorY2 = y6;
            if (y7 > maiorY2) maiorY2 = y7;
            if (y8 > maiorY2) maiorY2 = y8;

            boolean retangulo1Valido =
                    (x1 == menorX1 || x1 == maiorX1) && (y1 == menorY1 || y1 == maiorY1) &&
                            (x2 == menorX1 || x2 == maiorX1) && (y2 == menorY1 || y2 == maiorY1) &&
                            (x3 == menorX1 || x3 == maiorX1) && (y3 == menorY1 || y3 == maiorY1) &&
                            (x4 == menorX1 || x4 == maiorX1) && (y4 == menorY1 || y4 == maiorY1);

            boolean retangulo2Valido =
                    (x5 == menorX2 || x5 == maiorX2) && (y5 == menorY2 || y5 == maiorY2) &&
                            (x6 == menorX2 || x6 == maiorX2) && (y6 == menorY2 || y6 == maiorY2) &&
                            (x7 == menorX2 || x7 == maiorX2) && (y7 == menorY2 || y7 == maiorY2) &&
                            (x8 == menorX2 || x8 == maiorX2) && (y8 == menorY2 || y8 == maiorY2);

            if (!retangulo1Valido || !retangulo2Valido || menorX1 == maiorX1 || menorY1 == maiorY1 || menorX2 == maiorX2 || menorY2 == maiorY2) {
                System.out.println("Os pontos informados nao formam retangulos validos.");
            } else {
                boolean interceptam =
                        maiorX1 >= menorX2 &&
                                maiorX2 >= menorX1 &&
                                maiorY1 >= menorY2 &&
                                maiorY2 >= menorY1;

                if (interceptam) {
                    System.out.println("Os retangulos se interceptam.");
                } else {
                    System.out.println("Os retangulos nao se interceptam.");
                }
            }
        }

        scanner.close();
    }
}
