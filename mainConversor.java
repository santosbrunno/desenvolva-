import java.util.Scanner;

public class mainConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor(); // Instância da classe Conversor
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1. Quilômetros para Milhas");
            System.out.println("2. Metros para Centímetros");
            System.out.println("3. Quilogramas para Gramas");
            System.out.println("4. Celsius para Fahrenheit");
            System.out.println("5. Sair");
            System.out.print("Digite sua escolha (1-5): ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor em quilômetros: ");
                    double km = scanner.nextDouble();
                    double milhas = conversor.kmParaMilhas(km);
                    System.out.println(km + " quilômetros é igual a " + milhas + " milhas.");
                    break;

                case 2:
                    System.out.print("Digite o valor em metros: ");
                    double metros = scanner.nextDouble();
                    double centimetros = conversor.metrosParaCentimetros(metros);
                    System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");
                    break;

                case 3:
                    System.out.print("Digite o valor em quilogramas: ");
                    double quilogramas = scanner.nextDouble();
                    double gramas = conversor.quilogramasParaGramas(quilogramas);
                    System.out.println(quilogramas + " quilogramas é igual a " + gramas + " gramas.");
                    break;

                case 4:
                    System.out.print("Digite o valor em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
                    System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saindo do programa. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            }

            System.out.println(); // Linha em branco para melhor legibilidade
        }

        scanner.close();
    }
}