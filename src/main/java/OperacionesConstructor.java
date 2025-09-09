import java.util.Scanner;

public class OperacionesConstructor {
    private int valor1,valor2;
    private Scanner teclado;

    public OperacionesConstructor(){
        teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        valor1=teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2=teclado.nextInt();
    }

    public void sumar(){
        int suma=valor1+valor2;
        System.out.println("La suma es: "+suma);
    }

    public void restar(){
        int resta=valor1-valor2;
        System.out.println("La resta es: "+resta);
    }

    public void multiplicar(){
        int multiplica=valor1*valor2;
        System.out.println("La multiplicacion es: "+multiplica);
    }

    public void division(){
        int division=valor1/valor2;
        System.out.println("La division es: "+division);
    }

    public static void main(String []args){
        OperacionesConstructor obj=new OperacionesConstructor();
        obj.sumar();
        obj.restar();
        obj.multiplicar();
        obj.division();

        OperacionesConstructor obj2=new OperacionesConstructor();
        obj2.sumar();
        obj2.restar();
        obj2.division();
        obj2.multiplicar();
    }
}
