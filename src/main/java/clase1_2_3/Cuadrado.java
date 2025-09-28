package clase1_2_3;

import java.util.Scanner;

public class Cuadrado {
    private int lado;
    private Scanner teclado;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = teclado.nextInt();
    }

    public void imprimirPerimetro() {
        int perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    public void imprimirSuperficie(){
        int superficie =lado*lado;
        System.out.println("La superficie del cuadrado es: "+superficie);
    }

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.inicializar();
        cuadrado1.imprimirPerimetro();
        cuadrado1.imprimirSuperficie();

        Cuadrado cuadrado2 = new Cuadrado();
        cuadrado2.inicializar();
        cuadrado2.imprimirPerimetro();
        cuadrado2.imprimirSuperficie();
    }

}
