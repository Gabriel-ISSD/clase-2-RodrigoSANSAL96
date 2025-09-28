package clase1_2_3;

import java.util.Scanner;

public class poo_triangulo {
    private Scanner teclado;
    private int lado1, lado2, lado3;

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese lado 1: ");
        lado1 = teclado.nextInt();
        System.out.println("Ingrese lado 2: ");
        lado2 = teclado.nextInt();
        System.out.println("Ingrese lado 3: ");
        lado3 = teclado.nextInt();
    }

    public void ladoMayor() {
        if (lado1>lado2 && lado1>lado3){
            System.out.println("El lado mayor es: "+lado1);
        } else if (lado2>lado3) {
            System.out.println("El lado mayor es: "+lado2);
        } else {
            System.out.println("El lado mayor es: "+lado3);
        }
    }

    public void esEquilatero(){
        if (lado1==lado2 && lado1==lado3){
            System.out.println("El triangulo es equilatero");
        } else {
            System.out.println("El triangulo no es equilatero");
        }
    }

    public static void main(String[] args){
        poo_triangulo triangulo1 = new poo_triangulo();
        triangulo1.inicializar();
        triangulo1.ladoMayor();
        triangulo1.esEquilatero();

        poo_triangulo triangulo2 = new poo_triangulo();
        triangulo2= new poo_triangulo();
        triangulo2.inicializar();
        triangulo2.ladoMayor();
        triangulo2.esEquilatero();

    }

}
