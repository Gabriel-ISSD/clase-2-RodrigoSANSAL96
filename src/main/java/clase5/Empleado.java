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

    public void mayorEdad(){
        if(edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public void impuestos(){
        if(sueldo > 50000){
            System.out.println(nombre + " debe pagar impuestos");
        }else{
            System.out.println(nombre + " no debe pagar impuestos");
        }
    }
}
