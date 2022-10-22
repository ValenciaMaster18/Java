package Hotel;

public class Sencilla extends Hotel {
    private String bar;
    
    public Sencilla(String equipamiento, String estado, String servicios, String tipo, int piso, float precioPorNoche,String bar) {
        super(equipamiento, estado, servicios, tipo, piso, precioPorNoche);
        this.bar = bar;

    }
    
    @Override
    public String mensaje(){
        return "Detalles de la habitacion " + 
        "\n"+"Equipamiento: " + equipamiento + 
        "\n"+"Estado: " + estado + 
        "\n"+"Servicios: " +  servicios + 
        "\n"+"Tipo: " + tipo +  
        "\n"+"Piso: " + piso +
        "\n"+"Precio: " + precioPorNoche +
        "\n"+"Bar incluido: " + bar;


        }
}
