package Hotel;

public class Presidencial extends Hotel {
    private String piscina;
    private String spas;
    private String adicional;
    public Presidencial(String equipamiento, String estado, String servicios, String tipo, int piso,float precioPorNoche,String piscina,String spas, String adicional) {
        super(equipamiento, estado, servicios, tipo, piso, precioPorNoche);
        this.piscina = piscina;
        this.spas = spas;
        this.adicional = adicional;
    }

    @Override
    public String mensaje(){
        return "Detalles de la habitacion piso " + 
        "\n"+"Equipamiento: " + equipamiento + 
        "\n"+"Estado: " + estado + 
        "\n"+"Servicios: " +  servicios + 
        "\n"+"Tipo: " + tipo +  
        "\n"+"Piso: " + piso +
        "\n"+"Precio: " + precioPorNoche +
        "\n"+"Piscina: " + piscina +
        "\n"+"Spas: " + spas +
        "\n"+"Adicional: " + adicional;
        }  
}
