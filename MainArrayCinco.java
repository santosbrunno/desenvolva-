package AulasAda;

import java.util.Scanner;

public class MainArrayCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeNotas = 5;
        double[] notas = new double[numeroDeNotas];
        double soma = 0;
        String nome;
        System.out.println("Digite o nome do aluno:");
        nome = scanner.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + " do aluno: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / numeroDeNotas;
        System.out.println("A média das notas do aluno " + nome + " é: " + media);

        scanner.close();
    }
}