import javax.swing.JOptionPane;

public class alumnos {
    public static void main(String[] args) {

        int guardar[] = new int[6];
        int aprobados = 0;
        int noAprobados = 0;
        int notas = 0;


        for (int i = 0; i < guardar.length;i++){
            notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota alumno N°" + i +":"  ));
            guardar[i] = notas;

            if ((notas >= 0) && (notas <6)){
                noAprobados++;
            }else{
                aprobados++;
            }
        }
        System.out.println("Detalles de colegio");
        System.out.println("Estudiantes aprobados " + aprobados);
        System.out.println("Estudiantes No aprobados " + noAprobados);

        for (int i = 0; i < guardar.length;i++){
            System.out.println(guardar[i]);
        }
            
    }
    
}
