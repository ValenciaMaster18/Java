package Java2;


public class Raices {
    private double a, b, c;
    
    // Creamos el constructor

    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private void obtenerRaices(){
        double x1 = (-b + Math.sqrt(getdiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getdiscriminante()))/(2*a);
        
        System.out.println("Solucion 1");
        System.out.println(x1);
        System.out.println("Solucion 2");
        System.out.println(x2);
    }
    private void obtenerRaiz(){
        double x = (-b)/(2*a);

        System.out.println("Unica solucion");
        System.out.println(x);
    }
    private double getdiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    // Devuelve un boolean
    private boolean tieneRaices(){
        return getdiscriminante() >= 0;
    }
    // Devuelve un boolean
    private boolean tieneRaiz(){
        return getdiscriminante() == 0;
    }
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if (tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
    }
}

