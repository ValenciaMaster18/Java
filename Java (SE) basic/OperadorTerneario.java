import javax.swing.JOptionPane;

public class OperadorTerneario {
    public static void main(String arg []) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        mensaje = (numero %2 == 0) ? "Es par":"Es impar";

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
