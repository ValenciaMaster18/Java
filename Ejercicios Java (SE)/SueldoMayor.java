import javax.swing.JOptionPane;

public class SueldoMayor {
    public static void main(String[] args) {
        int cantidadSueldos = 0;
        cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de sueldos a evaluar: "));
        float sueldos[] = new float[cantidadSueldos];
        float agregarSueldos = 0;
        float mayor = sueldos[0];
        int contador = 1;

        for (int i = 0; i < sueldos.length; i++) {
            agregarSueldos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese sueldo N°"+contador++));
            sueldos[i] = agregarSueldos;
            if (sueldos[i] > mayor){
                mayor = sueldos[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,"Detalles...");
        JOptionPane.showMessageDialog(null,"Sueldo mayor " + mayor);
    }
}
    

