import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade47 {

    public static class Paciente {
        private String nome;
        private String sexo;
        private double peso;
        private int idade;
        private double altura;

        public Paciente () {};

        public Paciente(String nome, String sexo, double peso, int idade, double altura) {
            this.nome = nome;
            this.sexo = sexo;
            this.peso = peso;
            this.idade = idade;
            this.altura = altura;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean fim = false;

        List<Paciente> pacientes = new ArrayList<>();

        do {

            System.out.println("=============================");
            System.out.print("Nome: ");
            String nome = scanner.next();

            if (nome.equals("fim")) {
                fim = true;
                break;
            };


            System.out.print("Sexo: ");
            String sexo = scanner.next();

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            pacientes.add(new Paciente(nome, sexo, peso, idade, altura));

        } while (!fim);

        double mediaIdadeM = 0.0;
        int qtdFemAltPeso = 0;
        int qtdIdadeEntre = 0;
        int maiorIdade = 0;
        int idxMaisVelho = 0;
        double menorAltura = pacientes.get(0).getAltura();
        int idxMenorAltura = 0;
        int idadeTotal = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equals("m")) {
                mediaIdadeM += paciente.getIdade();
            }

            if (paciente.getSexo().equals("f") &&
                paciente.getAltura() >= 1.60 &&
                paciente.getAltura() <= 1.70 &&
                paciente.getPeso() > 70) {
                qtdFemAltPeso++;
            }

            if (paciente.getIdade() >= 18 &&
                paciente.getIdade() <= 25) {
                qtdIdadeEntre++;
            }

            if (paciente.getIdade() > maiorIdade) {
                maiorIdade = paciente.getIdade();
                idxMaisVelho = pacientes.indexOf(paciente);
            }

            if (paciente.getSexo().equals("f") &&
                paciente.getAltura() < menorAltura) {
                menorAltura = paciente.getAltura();
                idxMenorAltura = pacientes.indexOf(paciente);
            }

            idadeTotal += paciente.getIdade();
        }
        mediaIdadeM /= pacientes.size();

        System.out.println("qtd de pacientes: " + pacientes.size());
        System.out.println("media das idades dos homens: " + mediaIdadeM);
        System.out.println("mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + qtdFemAltPeso);
        System.out.println("qtd entre 18 e 25: " + qtdIdadeEntre);
        System.out.println("paciente mais velho: " + pacientes.get(idxMaisVelho).getNome());
        System.out.println("mulher mais baixa: " + pacientes.get(idxMenorAltura).getNome());
        System.out.println("idade total: " + idadeTotal);
    }
}
