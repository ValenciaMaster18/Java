import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Cajero{
    // Variables globales
    static String productos[] = new String[3];
    static int precios[] = new int[3];
    static int total;

    public static void main(String[] args) {
        entradaNombrePrecio();
        imprimirProducto();
   }
       
   public static void entradaNombrePrecio(){
    for (int i = 0; i < productos.length; i++) {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del producto: ");
        productos[i] = nombre;
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del producto: "));
        precios[i] = precio;
        total += precio;   
        }   
    }
    
    public static void imprimirProducto(){
        for (String guardarProductos : productos)
            System.out.println("El nombre del productos " +"\n"+ guardarProductos);
        for (int guardarPrecios : precios)
            System.out.println("EL precio de los prductos son " +"\n"+ guardarPrecios );
    }

}
