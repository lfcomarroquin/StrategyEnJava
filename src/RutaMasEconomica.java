public class RutaMasEconomica implements RutaStrategy{
    public String calcularRuta (String puntoA, String puntoB){
        int distancia = (RutaStrategy.puntoA + RutaStrategy.puntoB) % 75;
        double costo = distancia * 0.5;
        return "La ruta mas economica de " + puntoA + " a " + puntoB + " es de " + distancia + " km y costara $" + costo;
    }
}