package clase5.problemaPropuestoLibro;

public class Empresa {
    private LibroFisico libroFisico;
    private LibroVirtual libroVirtual;

    public Empresa() {
        libroFisico = new LibroFisico();
        libroVirtual = new LibroVirtual();
    }

    public void cargarLibros() {
        System.out.println("Cargar datos del libro físico");
        libroFisico.cargarDatosFisico();

        System.out.println("Cargar datos del libro virtual");
        libroVirtual.cargarDatosVirtual();
    }

    public void mostrarLibros() {
        System.out.println("Datos libro físico");
        libroFisico.imprimir();

        System.out.println("Datos libro virtual");
        libroVirtual.imprimir();
    }

    // Cantidad total de libros físicos vendidos
    public int totalFisicosVendidos() {
        return libroFisico.getVentas();
    }

    // Cantidad total de libros virtuales vendidos
    public int totalVirtualesVendidos() {
        return libroVirtual.getVentas();
    }

    // Libros físicos sin stock
    public int librosFisicosSinStock() {
        return libroFisico.sinStock();
    }
}
