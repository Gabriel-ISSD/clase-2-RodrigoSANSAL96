package clase1_2_3;

import java.util.Scanner;

public class Punto {
    private int x,y;
    private Scanner teclado;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese punto en x");
        x = teclado.nextInt();
        System.out.println("Ingrese punto en y");
        y = teclado.nextInt();
    }

    public void imprimirCuadrante(){
        if (x>0 && y>0){
            System.out.println("Primer Cuadrante");
        } else if (x>0 && y<0) {
            System.out.println("Cuarto Cuadrante");
        } else if (x<0 && y>0) {
            System.out.println("Segundo Cuadrante");
        } else {
            System.out.println("Tercer Cuadrante");
        }
    }

    public static void main(String[] args){
        Punto punto1 = new Punto();
        punto1.inicializar();
        punto1.imprimirCuadrante();

        Punto punto2 = new Punto();
        punto2.inicializar();
        punto2.imprimirCuadrante();
    }
}
