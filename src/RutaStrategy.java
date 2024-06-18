import java.util.Random;

public interface RutaStrategy {
    Random rand = new Random();
    int puntoA = rand.nextInt(100);
    int puntoB = rand.nextInt(100);
    int traficoRuta1 = rand.nextInt(100);
    int traficoRuta2 = rand.nextInt(100);
    String calcularRuta (String puntoA, String puntoB);
}