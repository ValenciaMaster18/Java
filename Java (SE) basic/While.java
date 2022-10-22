import java.util.Scanner;

public class While {
    public static void main(String arg []) {
        Scanner entrada = new Scanner(System.in);
        int numero,cuadrado;
        System.out.println("Ingrese un numero para sacar su raiz cuadrada");
        numero = entrada.nextInt();
        while (numero >= 0){
            cuadrado = (int) Math.pow(numero, 2); 
            System.out.println(cuadrado);
            System.out.println("Ingrese un numero para sacar su raiz cuadrada");
            numero = entrada.nextInt();
        }
    }
}
