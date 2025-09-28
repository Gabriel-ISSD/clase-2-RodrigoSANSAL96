package clase1_2_3;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String clave;
    private Scanner teclado;

    public Usuario(){
        teclado=new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        nombre=teclado.nextLine();
        System.out.println("Ingrese la clave del usuario");
        clave=teclado.nextLine();
    }

    public void imprimir(){
        System.out.println("Nombre del usuario: "+nombre);
        System.out.println("Clave del usuario: "+clave);
    }

    public void largoClave(){
        if(clave.length()<6){
            System.out.println("La clave ingresada tiene menos de 6 caracteres.");
        }else {
            System.out.println("La clave ingresada tiene mas de 6 caracteres");
        }
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.imprimir();
        usuario1.largoClave();

        Usuario usuario2 = new Usuario();
        usuario2.imprimir();
        usuario2.largoClave();
    }
}
