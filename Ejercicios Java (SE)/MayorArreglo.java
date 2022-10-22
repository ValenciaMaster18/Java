import java.util.Scanner;

public class MayorArreglo {
    public static void main(String args []) {
        int vector[] = new int[5];
        int  mayor = vector[0];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Los 5 numeros: ");

        for (int i = 0; i < vector.length;i++){
            // LLenando el arreglo
            vector[i] = entrada.nextInt();

            // Conparando si es mayor
            if (vector[i]>mayor){
                mayor = vector[i];
            }
        }

        System.out.println("El N° mayor es --> " + mayor);

    }
    
}
