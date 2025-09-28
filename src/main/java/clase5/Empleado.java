package clase5;

import java.util.Scanner;

public class Empleado extends Persona{
    protected float sueldo;

    public void cargar(){
        super.cargar();
        System.out.println("Ingrese su sueldo: ");
        sueldo = teclado.nextFloat();
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Sueldo: "+sueldo);
    }
}
