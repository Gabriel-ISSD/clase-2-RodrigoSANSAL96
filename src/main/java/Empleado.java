import java.util.Scanner;
public class Empleado {
    private Scanner teclado;
    private String nombre;
    private int sueldo;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Cargue el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Cargue el sueldo del empleado: ");
        sueldo = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Sueldo del empleado: "+sueldo);
    }

    public void pagaImpuestos() {
        if (sueldo > 3000){
            System.out.println("El empleado tiene que pagar impuestos");
        }else {
            System.out.println("El empleado no tiene que pagar impuestos");
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.inicializar();
        empleado1.imprimir();
        empleado1.pagaImpuestos();

        Empleado empleado2 = new Empleado();
        empleado2.inicializar();
        empleado2.imprimir();
        empleado2.pagaImpuestos();
    }
}
