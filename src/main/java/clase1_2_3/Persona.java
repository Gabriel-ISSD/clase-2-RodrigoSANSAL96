package clase1_2_3;

public class Persona {
    public String nombre;
    public int edad;
    public static int cantidad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }
}


