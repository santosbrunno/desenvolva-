public class Conversor {

    public static double kmParaMilhas(double km) {
        return km * 0.621371;
    }

    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    public static double quilogramasParaGramas(double quilogramas) {
        return quilogramas * 1000;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}