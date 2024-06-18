public class RutaMasRapida implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB) {
        int distancia = RutaStrategy.puntoA - RutaStrategy.puntoB;
        int distanciaRuta1 = distancia + traficoRuta1;
        int distanciaRuta2 = distancia + traficoRuta2;
        int tiempoEstimado = 0;
        String mensaje = "";

        if (distanciaRuta1 > distanciaRuta2) {
            tiempoEstimado = distanciaRuta1;
            mensaje = "La ruta mas rapida de " + puntoA + " a " + puntoB + " es de " + distanciaRuta1 + "km y te tomara aproximadamente " + tiempoEstimado + " minutos";
        } else if (distanciaRuta2 > distanciaRuta1) {
            tiempoEstimado = distanciaRuta2;
            mensaje = "La ruta mas rapida de " + puntoA + " a " + puntoB + " es de " + distanciaRuta2 + "km y te tomara aproximadamente " + tiempoEstimado + " minutos";
        }
        return mensaje;
    }
}