package clase4;
import java.util.Scanner;
public class Aleatorio {
    Scanner teclado;
    private int [] array;
    private int mayor,menor;

    public Aleatorio(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que tendra el arreglo: ");
        int n=teclado.nextInt();
        array = new int [n];

    }

    public void cargaValores(){
        for(int i=0;i<array.length;i++){
            array[i]=1 + (int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }

    }

    public void imprimirMenor(){
        menor=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<menor){
                menor=array[i];
            }
        }
        System.out.println("Menor: "+menor);
    }

    public void imprimirMayor(){
        mayor=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>mayor){
                mayor=array[i];
            }
        }
        System.out.println("Mayor: "+mayor);
    }

    public static void main(String[] args) {
        Aleatorio aleatorio = new Aleatorio();
        aleatorio.cargaValores();
        aleatorio.imprimirMayor();
        aleatorio.imprimirMenor();

    }
}
