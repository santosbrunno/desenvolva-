import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // int quantidade = frase.contarCaracteres();
       // System.out.println("A quantidade de caracteres na frase é: " + quantidade);

        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                try {
                    System.out.print("Digite seu peso em kg: ");
                    double peso = scanner.nextDouble();

                    System.out.print("Digite sua altura em metros: ");
                    double altura = scanner.nextDouble();

                    double imcValor = imc.calcularIMC(peso, altura);
                    System.out.println("IMC: " + imcValor);

                    String categoria = imc.determinarCategoria(imcValor);
                    System.out.println("Categoria: " + categoria);

                    String desenho = imc.gerarDesenho(categoria);
                    System.out.println(desenho);
                }
                    catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                    catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, insira números válidos.");
                    scanner.nextLine();  // Limpar o buffer de entrada
                }
                System.out.print("Deseja calcular outro IMC? (s/n): ");
                String resposta = scanner.next().trim().toLowerCase();
                continuar = resposta.equals("s");
            }

            System.out.println("Obrigado por usar o programa!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
