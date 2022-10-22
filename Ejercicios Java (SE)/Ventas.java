import java.util.Scanner;

public class Ventas {
    public static void main(String args []) {
        int element;
        double ventas [] = new double[30];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos elementos desea guardar: ");
        element = entrada.nextInt();
        System.out.println("Ingrese las ventas del mes: ");
        
        for (int i = 0; i < element; i++) {
            System.out.println("Ventas "+ (i+1));
            ventas[i] = entrada.nextDouble();
        }

        for (double guardar : ventas) {
            System.out.println(guardar);
            
        }
    }
    
}