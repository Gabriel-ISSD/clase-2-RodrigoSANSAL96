package clase5;

public class Dado {
    private int valor;

    public void tirar() {
        valor = 1 + (int) (Math.random() * 6);

    }

    public void imprimir() {
        System.out.println("Valor: " + valor);
    }

    public int getValor() {
        return valor;
    }
}

