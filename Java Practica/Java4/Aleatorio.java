package Java4;

public class Aleatorio {
    public static int generaNumeroAleatorio(int minimo, int maximo){
        int num = (int) Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    public static double generarDecimalAleatorio(int minimo, int maximo){
        double num = Math.floor(Math.random()*(minimo-maximo+1)+(maximo+1));
        return num;
    }
}
