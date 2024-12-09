import java.util.Scanner;

public class frase {
    public static int contarCaracteres() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String contarfrase = scanner.nextLine();

        return contarfrase.length();
}
}
