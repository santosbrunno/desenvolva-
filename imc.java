public class imc {

    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser valores positivos.");
        }
        return peso / (altura * altura);
    }

    public static String determinarCategoria(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static String gerarDesenho(String categoria) {
        switch (categoria) {
            case "Abaixo do peso":
                return """
                         O
                        /|\\
                        / \\
                    (Abaixo do peso)
                    """;
            case "Peso normal":
                return """
                         O
                        /|\\
                        / \\
                    (Peso normal)
                    """;
            case "Sobrepeso":
                return """
                         O
                       --|--
                        / \\
                    (Sobrepeso)
                    """;
            case "Obesidade":
                return """
                         O
                       -/|\\-
                        / \\
                    (Obesidade)
                    """;
            default:
                return "(Desenho não disponível)";
        }
    }
}
