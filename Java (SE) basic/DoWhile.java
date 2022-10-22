import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String [] arg){
        int numero,guardar,contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numero aleatorio entre el (0 al 100");
        numero = input.nextInt();
        
        Random aleatorio = new Random();
        guardar = aleatorio.nextInt(101);

        do{
            if (numero > guardar){
                System.out.println("El numero es menor");
                contador++;
            }
            else if(numero == guardar){
                contador++;
                System.out.println("Ingrese numero aleatorio entre el (0 al 100");
                break;
            }
            
            else{
                System.out.println("El numero es mayor");
                contador++;
            }
            System.out.println("Ingrese numero aleatorio");
            numero = input.nextInt();   
        } while (true);
    }
}
