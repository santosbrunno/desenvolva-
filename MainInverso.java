package AulasAda;
import java.util.Scanner;

public class MainInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeElementos = 5;
        int[] numeros = new int[numeroDeElementos];

        for (int i = 0; i < numeroDeElementos; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números em ordem inversa são:");
        for (int i = numeroDeElementos - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        scanner.close();
    }
}

