package Hotel;

public abstract class Hotel {
    protected String equipamiento;
    protected String estado;
    protected String servicios;
    protected String tipo;
    protected int piso;
    protected float precioPorNoche;
    
    public Hotel(String equipamiento, String estado, String servicios, String tipo, int piso, float precioPorNoche) {
        this.equipamiento = equipamiento;
        this.estado = estado;
        this.servicios = servicios;
        this.tipo = tipo;
        this.piso = piso;
        this.precioPorNoche = precioPorNoche;
    }

    public abstract String mensaje();
}

        
