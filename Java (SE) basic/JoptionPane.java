import javax.swing.JOptionPane;

public class JoptionPane {
    public static void main(String [] arg) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un entero: "));;

        JOptionPane.showMessageDialog(null,"La cadena es  " + cadena);
        JOptionPane.showMessageDialog(null,"El entero es  " + entero);
        JOptionPane.showMessageDialog(null,"La letra es  " + letra);
        JOptionPane.showMessageDialog(null,"El decimal es  " + decimal);
    }

    public static void showMessageDialog(Object object, float resto) {
    }
}
