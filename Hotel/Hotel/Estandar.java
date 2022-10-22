package Hotel;

public class Estandar extends Hotel{
    private String parqueo;
    private String piscina;
    public Estandar(String equipamiento, String estado, String servicios, String tipo, int piso, float precioPorNoche,String parqueo,String piscina) {
        super(equipamiento, estado, servicios, tipo, piso, precioPorNoche);
        this.parqueo = parqueo;
        this.piscina = piscina;
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
        "\n"+"Parqueadero: " + parqueo +
        "\n"+"Piscina: " + piscina;
        }
}
