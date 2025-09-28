package clase5;

import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected int edad;
    protected Scanner teclado;

    public Persona() {
        teclado  = new Scanner(System.in);
    }

    public void cargar(){
        System.out.println("Ingrese su nombre: ");
        nombre =  teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
