import java.util.Scanner;

public class TotalPagar {
    public static void main(String[] args) {
        int cantidadPiezas = 0;
        float totalPagar = 0;
        
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Ingrese cantidad de piezas a comprar: ");
        cantidadPiezas = pregunta.nextInt();

        switch ((cantidadPiezas >= 50 && cantidadPiezas < 100)? 0:
        (cantidadPiezas == 100)? 1 : 2) {
            case 0:
                totalPagar = cantidadPiezas * 4.5f;
                break; 
            case 1:
                totalPagar = cantidadPiezas * 4f;
                break;    
            case 2:
                totalPagar = cantidadPiezas * 5f;      
                break;
            }

        System.out.println("Total a pagar " + totalPagar);
    }
}
