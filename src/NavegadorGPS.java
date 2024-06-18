public class NavegadorGPS {
    private RutaStrategy strategy;

    public NavegadorGPS(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public String calcularRuta(String puntoA, String puntoB) {
        return strategy.calcularRuta(puntoA, puntoB);
    }
}