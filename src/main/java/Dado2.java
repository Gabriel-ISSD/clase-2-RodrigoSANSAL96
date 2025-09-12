public class Dado2 {
    private int valor;

    public Dado2() {
        valor=1;
    }
    public Dado2(int valor) {
        this.valor = valor;
    }
    public void imprimir(){
        System.out.println("Valor del dado: "+valor);
    }

    public static void main(String[] args) {
        Dado2 dado1 = new Dado2();
        Dado2 dado2 = new Dado2(6);
        dado1.imprimir();
        dado2.imprimir();
    }

}
