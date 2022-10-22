import java.util.Scanner;

public class GestionFacturas {
    public static void main(String[] args) {
        String codigo = " ";
        int  kilos = 0;
        float precio = 0;
        float facturacionTotal = 0;
        float total = 0;
        int cantidadKilos = 0;
        int facturas = 0 ;

        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i<6;i++){
            System.out.println("Comprando...");
            System.out.println("Ingrese codigo de la factura: " + i);
            codigo = entrada.next();
            System.out.println("Ingrese cantidad kilos vendidos: ");
            kilos = entrada.nextInt();
            cantidadKilos += kilos;
            System.out.println("Ingrese precio del kilo: ");
            precio = entrada.nextFloat();
            total = kilos * precio;

            facturacionTotal += total;
            
            if (total >= 1000){
                facturas++;
            }
        }
        System.out.println("Detalles de la compra...");
        System.out.println("Cantidad de (Dinero en total) " + facturacionTotal);
        System.out.println("Cantidad de (Kilos vendidos) " + cantidadKilos);
        System.out.println("Cantidad de (facturas superiores a 1000) " + facturas);
    }   
}
