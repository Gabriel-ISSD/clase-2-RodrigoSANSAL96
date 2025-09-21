package clase4;

import java.util.Scanner;

public class ArrayBidimensional2x5 {
    private int [][] arraybi;
    private Scanner teclado;

    public ArrayBidimensional2x5(){
        Scanner teclado = new Scanner(System.in);
        arraybi = new int [2][5];
        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                System.out.print("Ingresa el valor de la fila " + i + " y la columna "+j+" : ");
                arraybi[i][j] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                System.out.print(arraybi[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        ArrayBidimensional2x5 obj = new ArrayBidimensional2x5();
        obj.imprimir();
    }
}
