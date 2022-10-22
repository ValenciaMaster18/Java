package Java1;

public class Libro {
    // Atributos son las propiedades de ese objeto.
    private int ISBN;
    private String titulo;
    private String autor;
    private int numerosPaginas;

    // Metodo constructor que se encarga de inicializar el objeto

    public Libro(int ISBN, String titulo, String autor, int numerosPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numerosPaginas = numerosPaginas;
    }

    // Metodos get y set. el get devuelve el valor del atributo y el set es modificar el atributo
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumerosPaginas() {
        return numerosPaginas;
    }
    public void setNumerosPaginas(int numerosPagnas) {
        this.numerosPaginas = numerosPagnas;
    }
    @Override
    public String toString(){
        return "El libro "+titulo +" con " +ISBN+ 
        " creado por el autor " +autor+
        " tiene " +numerosPaginas+" paginas.";
    }
}
