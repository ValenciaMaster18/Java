import java.util.Scanner;

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String arg []){
        float saldo_inicial = 1000f,ingresar,retirar;
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion del menú: " 
        + "\n"+ "1) Ingresar saldo"
        + "\n"+ "2) Retirar saldo" 
        + "\n"+ "3) Salir"));

        switch(opcion){
            case 1: 
                ingresar = Float.parseFloat(JOptionPane.showInputDialog("Monto a ingresar a la cuenta: "));
                saldo_inicial += ingresar;
                JOptionPane.showMessageDialog(null, "Nuevo saldo: " + saldo_inicial);
                break;
            case 2:
                retirar = Float.parseFloat(JOptionPane.showInputDialog("Ingrese saldo a retirar: "));
                if (retirar > saldo_inicial){
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                }else{
                    saldo_inicial -= retirar;
                    JOptionPane.showMessageDialog(null,"Retiro valido saldo en la cuenta " + saldo_inicial);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
    }
    
}
