public class RutaMasCorta implements RutaStrategy{
    public String calcularRuta (String puntoA, String puntoB) {
        int ditancia = Math.min(RutaStrategy.puntoA, RutaStrategy.puntoB);
        return "La ruta mas corta de " + puntoA + " a " + puntoB + " es de " + ditancia + "km";
    }
}