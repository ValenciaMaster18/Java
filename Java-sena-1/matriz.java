import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class matriz{
    
    public static void main(String[] args) throws IOException {
    int num[][] = new int[5][5];
    Scanner entrada = new Scanner(System.in);
    for (int fila = 0; fila < num.length; fila++) {
        for (int columna = 0; columna < num[fila].length; columna++) {
            System.out.print("Ingrese valor para la fila " + fila + " Columna " + columna+": ");
            num[fila][columna] = entrada.nextInt();
            Runtime.getRuntime().exec("clear");
        }
    }
    System.out.println(Arrays.deepToString(num));
    }
}