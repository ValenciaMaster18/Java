import java.util.Scanner;

public class Operadores {
    public static void main(String [] arg){
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2,mult,div,sum,res,resto;
        System.out.println("Ingrese 2 numeros");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        sum = numero1 + numero2;
        res = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es " + sum);
        System.out.println("La resta es " + res);
        System.out.println("La multiplicacion es " + mult);
        System.out.println("La division es " + div);
        System.out.println("El resto es " + resto);
    }
}
