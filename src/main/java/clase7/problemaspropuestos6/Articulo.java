package clase7.problemaspropuestos6;

public class Articulo {
    private String nombre;
    private Double precio;

    public Articulo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }
}
