package AulasAda;

import java.util.Random;
import java.util.Scanner;

public class MainAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            int numeroAleatorio = random.nextInt(10) + 1;
            int palpite = 0;

            System.out.println("Bem-vindo ao nosso jogo!");
            System.out.println("Nesse Jogo você terá que tentar adivinhar o número que está entre 1 e 10.");

            while (palpite != numeroAleatorio) {
                System.out.print("Dê o seu palpite: ");
                palpite = scanner.nextInt();

                if (palpite < numeroAleatorio) {
                    System.out.println("Dica: O número é maior.");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("Dica: O número é menor.");
                } else {
                    System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
                }
            }
            System.out.print("Você gostaria de jogar novamente? (s/n): ");
            String resposta = scanner.next();
            jogarNovamente = resposta.equalsIgnoreCase("s");

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");

        scanner.close();
    }
}