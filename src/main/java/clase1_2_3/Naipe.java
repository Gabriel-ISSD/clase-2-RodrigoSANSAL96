package clase1_2_3;

public class Naipe {
    private String tipo;
    private int numero;

    private Naipe(String t, int num){
        tipo = t;
        numero = num;
    }

    public void imprimir(){
        System.out.println("El tipo de carta es: "+tipo);
        System.out.println("El numero de la carta es: "+numero);
    }

    public static void main(String[] args){
        Naipe carta1 = new  Naipe("Copa",10);
        Naipe carta2 = new  Naipe("Oro",8);
        Naipe carta3 = new Naipe("Espada", 1);

        carta1.imprimir();
        carta2.imprimir();
        carta3.imprimir();
    }
}

