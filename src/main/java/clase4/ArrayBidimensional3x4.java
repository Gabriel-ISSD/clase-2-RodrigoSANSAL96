package clase4;
import java.util.Scanner;
public class ArrayBidimensional3x4 {
    private int [][] arraybi;
    private Scanner teclado;

    public ArrayBidimensional3x4() {
        arraybi = new int [3][4];
        teclado = new Scanner(System.in);
        for(int j=0; j<3; j++){
            for(int i=0; i<4; i++){
                System.out.println("Ingrese los valores de la fila "+j+" y la columna "+i+ " :");
                arraybi[j][i] = teclado.nextInt();
            }
        }
    }

    public void primeraFila(){
        for(int j=0; j<3; j++){
            if (j==0){
                System.out.println("Imprimimos la primera fila");
                for(int i=0; i<4; i++){
                    System.out.print(arraybi[j][i]+" ");
                }
            }
        }
        System.out.println("");
    }

    public void ultimafila(){
        for(int j=0; j<3; j++){
            if (j==2){
                System.out.println("Imprimimos la ultima fila");
                for(int i=0; i<4; i++){
                    System.out.print(arraybi[j][i]+" ");
                }
            }
        }
        System.out.println("");

        System.out.println("Imprimimos la primera columna");
        for(int j=0; j<3; j++){
            for(int i=0; i<4; i++){
                if(i==0){
                    System.out.print(arraybi[j][i]+" ");
                }
            }
        }
    }

    public static void main(String [] args){
        ArrayBidimensional3x4 obj = new ArrayBidimensional3x4();
        obj.primeraFila();
        obj.ultimafila();
    }
}
