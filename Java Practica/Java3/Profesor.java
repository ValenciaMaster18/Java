
package Java3;

//Clase profesor que hereda de la clase Persona
public class Profesor extends Personas{

    /*Atributos*/
    private String materia;

    /*Constructores*/
    public Profesor(){
        super(); //Llama al constructor padre

        super.setEdad(Aleatorio.generaNumeroAleatorio(25,50)); //llama al metodo padre

        materia=Constantes.MATERIAS[Aleatorio.generaNumeroAleatorio(0,2)];
    }

    /*Metodos*/

    /**
     * Devuelve la materia del profesor
     * @return
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Modifica la materia del profesor
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Calcula la disponibilidad del profesor(20%)
     */
    @Override
    public void disponibilidad() {

        int prob=Aleatorio.generaNumeroAleatorio(0, 100);

        if(prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }

    }

}
