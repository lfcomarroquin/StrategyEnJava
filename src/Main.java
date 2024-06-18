public class Main {
    public static void main(String[] args) {

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        System.out.println(gps.calcularRuta("Punto A", "Punto B"));

        gps.setRutaStrategy(new RutaMasCorta());
        System.out.println(gps.calcularRuta("Punto A", "Punto B"));

        gps.setRutaStrategy(new RutaMasEconomica());
        System.out.println(gps.calcularRuta("Punto A", "Punto B"));
    }
}