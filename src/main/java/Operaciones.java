import java.util.Scanner;

public class Operaciones {
    private Scanner teclado;
    private int valor1,valor2;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
    }


    public void sumar(){
        int suma=valor1+valor2;
        System.out.println("La suma de los valores ingresados es: "+suma);
    }

    public void restar(){
        int resta=valor1-valor2;
        System.out.println("La resta de los valores ingresados es: "+resta);
    }

    public void multiplicar(){
        int multiplica=valor1*valor2;
        System.out.println("La multiplicacion de los valores ingresados es: "+multiplica);
    }

    public void division(){
        int division=valor1/valor2;
        System.out.println("La division del valores ingresados es: "+division);
    }

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        op.inicializar();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.division();

        Operaciones op2 = new Operaciones();
        op2.inicializar();
        op2.sumar();
        op2.restar();
        op2.multiplicar();
        op2.division();
    }
}
