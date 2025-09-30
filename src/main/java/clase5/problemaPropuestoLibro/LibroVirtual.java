package clase5.problemaPropuestoLibro;

public class LibroVirtual extends Libro {
    protected int ventas;
    protected String formato;

    public void cargarDatosVirtual() {
        cargar();
        System.out.println("Ingrese el formato del libro (PDF, EPUB, etc.): ");
        formato = teclado.nextLine();

        System.out.println("Ingrese la cantidad de ventas virtuales: ");
        ventas = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("Formato: " + formato);
        System.out.println("Cantidad de ventas de libros virtuales: " + ventas);
    }

    public int getVentas() {
        return ventas;
    }
}
