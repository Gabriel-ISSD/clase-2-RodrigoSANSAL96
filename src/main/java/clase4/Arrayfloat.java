package clase4;
import java.util.Scanner;
public class Arrayfloat {
    private float [] array;
    private float promedio, suma;
    private int menores, mayores;
    Scanner teclado;

    public Arrayfloat(){
        array = new float[5];
        promedio = 0;
        menores = 0;
        mayores = 0;
        suma=0;
        teclado = new Scanner(System.in);
    }

    public void promedio(){
        for (int i=0;i<array.length;i++){
            System.out.print("Ingrese el valor del elemento "+(i)+": ");
            array[i]=teclado.nextFloat();
            suma += array[i];
        }
        promedio = suma/array.length;
        System.out.println("Promedio: "+promedio);
    }

    public void personas(){
        for (int i=0;i<array.length;i++){
            if(array[i]>promedio){
                mayores++;
            }else{
                menores++;
            }
        }
        System.out.println("Personas con mayor altura que el promedio: "+mayores);
        System.out.println("Personas con menor altura que el promedio: "+menores);
    }

    public static void main(String [] args) {
        Arrayfloat array1 = new Arrayfloat();
        array1.promedio();
        array1.personas();

    }
}
