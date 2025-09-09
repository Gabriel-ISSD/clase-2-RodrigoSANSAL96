import java.util.Scanner;
public class poo_ejemplo1 {
    private Scanner teclado;
    private String nombre;
    private int edad;

    public void inicialilzar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

    public void esMayorEdad() {
        if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public static void main(String[] args) {
        poo_ejemplo1 persona1;
        persona1= new poo_ejemplo1();
        persona1.inicialilzar();
        persona1.imprimir();
        persona1.esMayorEdad();

        poo_ejemplo1 persona2;
        persona2= new poo_ejemplo1();
        persona2.inicialilzar();
        persona2.imprimir();
        persona2.esMayorEdad();
    }
}
