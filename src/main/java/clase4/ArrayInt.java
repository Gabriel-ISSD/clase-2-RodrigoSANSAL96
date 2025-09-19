package clase4;

import java.util.Scanner;

public class ArrayInt {
    private int[] elementos;
    private Scanner teclado;
    private int total;
    private int mayor;

    public ArrayInt() {
        elementos = new int[4];
        total=0;
        mayor=0;
        teclado = new Scanner(System.in);
    }

    public void carga(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Ingresa el valor del elemento " + i + ": ");
            elementos[i] = teclado.nextInt();
        }
    }

    public void valorAcumulado(){
        for (int i = 0; i < elementos.length; i++) {
            total= total + elementos[i];
        }
        System.out.println("El suma de los valores ingresados es:  " + total);

    }

    public void mayores(){
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i]>50){
                mayor= mayor+1;
            }
        }
        System.out.println("Hay  "+mayor+ " numeros mayores que 50");
    }

    public static void main(String[] args) {
        ArrayInt objeto = new ArrayInt();
        objeto.carga();
        objeto.valorAcumulado();
        objeto.mayores();
    }
}
