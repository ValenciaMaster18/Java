package Java4;

public class Asiento {
    private char letra;
    private int fila;
    private Expectador expectador;

    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.expectador = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Expectador getExpectador() {
        return expectador;
    }

    public void setExpectador(Expectador expectador) {
        this.expectador = expectador;
    }

    public boolean ocupado(){
        return expectador != null;
    }
}
