public class Dado3 {
    private int valor;

    public Dado3() {
        tirar();
        imprimir();
    }

    public void tirar(){
        valor = 1 + (int) (Math.random() * 6);
    }

    public void imprimir(){
        System.out.println("Valor: " + valor);
    }

    public static void main(String[] args) {
        Dado3 dado3 = new Dado3();
    }
}
