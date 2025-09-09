import java.util.Scanner;

public class EmpleadoConstructor {
    private String nombre;
    private int sueldo;
    private Scanner teclado;

    public EmpleadoConstructor(){
        teclado=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        nombre=teclado.nextLine();
        System.out.println("Ingrese sueldo del empleado");
        sueldo=teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Sueldo del empleado: "+sueldo);
    }

    public void pagaImpuesto(){
        if (sueldo>3000){
            System.out.println("El empleado tiene que pagar impuestos");
        } else {
            System.out.println("El empleado no tiene que pagar impuestos");
        }
    }

    public static void main(String[] args) {
        EmpleadoConstructor emp=new EmpleadoConstructor();
        emp.imprimir();
        emp.pagaImpuesto();

        EmpleadoConstructor emp2=new EmpleadoConstructor();
        emp2.imprimir();
        emp2.pagaImpuesto();
    }
}
