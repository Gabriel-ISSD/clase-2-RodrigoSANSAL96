package clase7.problema8;

public class Tarjeta {
    private String tipo;
    private long numero;

    public Tarjeta(String tipo, long numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public long getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Número: " + numero;
    }
}
