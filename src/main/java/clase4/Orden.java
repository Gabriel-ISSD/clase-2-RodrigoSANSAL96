package clase4;

import java.util.Scanner;

public class Orden {
    Scanner teclado;
    private int [] array;

    public Orden(){
        teclado = new Scanner(System.in);
        array = new int [5];
    }

    public void cargar(){
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el valor del elemento" +i+ ":");
            array[i]=teclado.nextInt();
        }
    }
    public boolean validar(){
        for(int i=0;i< array.length-1;i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public void ordenado(){
            if(validar()){
                System.out.println("El array esta ordenado de menor a mayor");
            }else {
                System.out.println("El array no esta ordenado");
            }
    }

    public static void main(String[] args) {
        Orden orden = new Orden();
        orden.cargar();
        orden.validar();
        orden.ordenado();

    }
}
