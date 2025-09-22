package clase4;

import java.util.Scanner;

public class ArrayIrregular {
    private int [][] arrayIrre;
    private Scanner teclado;

    public ArrayIrregular() {
        teclado = new Scanner(System.in);
        arrayIrre = new int[5][];
        arrayIrre[0] = new int[0];
        arrayIrre[1] = new int[1];
        arrayIrre[2] = new int[2];
        arrayIrre[3] = new int[3];
        arrayIrre[4] = new int[4];
    }

    public void carga(){
        for(int j=0; j<arrayIrre.length; j++){
            for(int i=0; i<arrayIrre[j].length; i++){
                System.out.println("Ingrese el valor");
                arrayIrre[j][i] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for(int j=0; j<arrayIrre.length; j++){
            for(int i=0; i<arrayIrre[j].length; i++){
                System.out.print(arrayIrre[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        ArrayIrregular irregular = new ArrayIrregular();
        irregular.carga();
        irregular.imprimir();
    }
}
