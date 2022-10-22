import java.util.Scanner;

public class Entrada{
    public static void main(String [] arg) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        byte edad;
        float estatura;
        char letra;

        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine();

        System.out.println("Hola, " + nombre + " Ingrese su edad");
        edad = entrada.nextByte();

        System.out.println("Ingrese su estatura");
        estatura = entrada.nextFloat();

        System.out.println("Ingrese una letra");
        letra = entrada.next().charAt(0);
        
        System.out.println("Gracias " + nombre + " tu edad " + edad + " años");
    
    }
}