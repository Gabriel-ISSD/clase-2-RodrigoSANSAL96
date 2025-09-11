public class Dado {
    private int valor;

    public Dado(){
        valor=1;
    }

    public void tirar(){
        valor = 1 + (int)(Math.random()*6);
    }

    public void imprimir(){
        System.out.println("Valor del dado: "+valor);
    }

    public static void main(String[] args) {
        Dado dado1 = new Dado();
        dado1.tirar();
        dado1.imprimir();
        Dado dado2 = new Dado();
        dado2.tirar();
        dado2.imprimir();
        Dado dado3 = new Dado();
        dado3.tirar();
        dado3.imprimir();
    }
}
