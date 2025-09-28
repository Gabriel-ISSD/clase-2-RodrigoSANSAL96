package clase5.problemaPropuestoAnimal;

import java.util.Scanner;

public class Animal {
    protected String foto;
    protected int tamaño;
    protected String localizacion;
    protected Scanner teclado;

    public Animal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la foto");
        foto = teclado.nextLine();
        System.out.println("Ingrese el tamaño");
        tamaño = teclado.nextInt();
        System.out.println("Ingresa el localizacion");
        localizacion = teclado.next();
    }

    public void comer(){
        System.out.println("El animal ya comio");
    }

    public void dormir(){
        System.out.println("El animal ya durmio");
    }

    public void hacerRuido(){
        System.out.println("El animal hizo ruido");
    }

    public void caer(){
        System.out.println("El animal se cayo");
    }
}
