package AulasAda;

import java.util.Scanner;

public class Frase {
    public static int contarCaracteres() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String contarfrase = scanner.nextLine();

        return contarfrase.length();
}
}
