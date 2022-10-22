import javafx.css.Match;

public class Funciones {
    public static void main(String arg []) {
        double area = areaCirculo(5);
        System.out.println(area);

    }

    /**
     * Descripcion: Esta funcion  busca el area de un circulo
     * @param radio EL radio del circulo que desea buscar su area
     * @return El area del circulo
     */
    public static double areaCirculo(double radio){
        return Math.PI * Math.pow(radio,2);
    }
}

