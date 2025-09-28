package clase5;

import java.util.Scanner;

public class Socio {
    private String nombre;
    private int antiguedad;
    private Scanner teclado;

    public Socio() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Socio: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el antiguedad del Socio: ");
        antiguedad = teclado.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}
