import java.sql.Date;
import java.util.ArrayList;

public class Doctor {
    // Atributos o propiedades
    static int id = 0; // Auto-incrementado
    private String name;
    private String especialidad;


    public static int getId() {
        return id;
    }


    public static void setId(int id) {
        Doctor.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    // Constructor
    Doctor(){
        System.out.println("Creando el objeto Doctor");
        id++;
    }


    // Comprtamiento o metodos
    public void imprimirNombre(){
        System.out.println(name);
    }

    
    public void imprimirID() {
        System.out.println("El ID del doctor es " + id);
    }
    
    // Creamos la lista de array
    ArrayList<validacionCita> validacion = new ArrayList<>();
    public void validacionCitas(Date date, String time){
        validacion.add(new Doctor.validacionCita(date, time));
    }
    // Mostramos la lista de array

    public ArrayList<validacionCita> getvalidacionCita(){
        return validacion;
    }
    
    


    // Clase anidada
    public static class validacionCita{
        private int id_validacioCita;
        private Date date;
        private String time;
    // Constructor
        public validacionCita(Date date, String time) {
            this.date = date;
            this.time = time;
        
    }
        public int getId_validacioCita() {
            return id_validacioCita;
        }
        public void setId_validacioCita(int id_validacioCita) {
            this.id_validacioCita = id_validacioCita;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
    }




    public void validacionCitas(java.util.Date date, String time) {
    }
}
