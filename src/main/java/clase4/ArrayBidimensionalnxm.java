package clase4;

import java.util.Scanner;

public class ArrayBidimensionalnxm {
    private int [][] arraybi;
    private Scanner teclado;
    private int n,m;

    public ArrayBidimensionalnxm() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de filas: ");
        n = teclado.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        m = teclado.nextInt();
        arraybi = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Ingrese el valor de la fila "+i+" y la columna "+j+" : ");
                arraybi[i][j] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arraybi[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void intercambiar(){
        for (int i=0; i<m; i++){
            int aux = arraybi[0][i];
            arraybi[0][i] = arraybi[1][i];
            arraybi[1][i] = aux;
        }
    }

    public void imprimirInverso(){
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arraybi[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        ArrayBidimensionalnxm obj = new ArrayBidimensionalnxm();
        obj.imprimir();
        obj.intercambiar();
        obj.imprimirInverso();
    }
}
