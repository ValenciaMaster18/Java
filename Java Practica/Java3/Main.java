package Java3;

public class Main {

    public static void main(String[] args) {

        //Creamos el objeto
        Aula aula=new Aula();

        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
        }

    }

}