package clase5;

public class JuegoDeDados {
    public Dado dado1, dado2, dado3;

    public JuegoDeDados(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
    }

    public void jugar(){
        dado1.tirar();
        dado1.imprimir();
        dado2.tirar();
        dado2.imprimir();
        dado3.tirar();
        dado3.imprimir();
        if(dado1.getValor() == dado2.getValor() && dado1.getValor() == dado3.getValor()){
            System.out.println("Gano");
        }else {
            System.out.println("Perdio");
        }
    }

    public static void main(String[] args) {
        JuegoDeDados j = new JuegoDeDados();
        j.jugar();
    }
}
