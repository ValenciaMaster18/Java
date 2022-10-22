package Java4;

public class Cine {
    private Asiento[][] asientos;
    private double precio;
    private Pelicula pelicula;

    public Cine(int filas,int columnas,double precio, Pelicula pelicula){
        asientos = new Asiento [filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenarCine();
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    private void rellenarCine(){
        int filas = asientos.length;
        for (int i = 0; i <asientos.length ; i++) {
            for (int j = 0; j <asientos[0].length ; j++) {
                asientos[i][j] = new Asiento((char) ('A'+j),filas);
            }
            filas--;
        }
    }
    public boolean haysitios() {
        boolean haysitio = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (! asientos[i][j].ocupado()){
                    haysitio = true;
                    break;
                }
            }
        }
        return haysitio;
    }
    public boolean haysitios(int fila, char columna){
        return asientos[asientos.length-fila][columna-'A'].ocupado();
    }
}
