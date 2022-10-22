package Java1;

public class Main {
    public static void main(String[] args) {
    Libro libro1 = new Libro(1234567,"Historia de messi","Luis Valencia",30);
    Libro libro2 = new Libro(12345,"Historia de cr7","Luis Mario",45);
    
    System.out.println(libro1.toString());
    System.out.println(libro2.toString());

    libro2.setNumerosPaginas(70);

    if (libro1.getNumerosPaginas()>libro2.getNumerosPaginas()){
        System.out.println("El libro " +libro1.getTitulo()+" Tienes mas paginas" );
    }else{
        System.out.println("El libro " +libro2.getTitulo()+" Tiene mas paginas");
        }
    }
}
