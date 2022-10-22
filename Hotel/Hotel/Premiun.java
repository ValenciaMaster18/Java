package Hotel;

public class Premiun extends Hotel{
    private String limpieza; 
    private String restaurante;
    public Premiun(String equipamiento, String estado, String servicios, String tipo, int piso, float precioPorNoche,String limpieza,String restaurante) {
        super(equipamiento, estado, servicios, tipo, piso, precioPorNoche);
        this.limpieza = limpieza;
        this.restaurante = restaurante;
    }


    public String mensaje(){
        return "Detalles de la habitacion " + 
        "\n"+"Equipamiento: " + equipamiento + 
        "\n"+"Estado: " + estado + 
        "\n"+"Servicios: " +  servicios + 
        "\n"+"Tipo: " + tipo +  
        "\n"+"Piso: " + piso +
        "\n"+"Precio: " + precioPorNoche + 
        "\n"+"Limpieza incluida: " + limpieza +
        "\n"+"Comida incluida: " + restaurante;
        }
}
