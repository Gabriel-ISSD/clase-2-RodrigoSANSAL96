package clase5.problemaPropuestoLibro;

public class Main {

    public static void main(String[] args) {
        Empresa empresa1 =  new Empresa();
        Empresa empresa2 = new Empresa();

        // Carga e impresion de libros de cada empresa
        empresa1.cargarLibros();
        empresa1.mostrarLibros();
        empresa2.cargarLibros();
        empresa2.mostrarLibros();

        // Ventas de libros fisicos de cada empresa
        empresa1.totalFisicosVendidos();
        empresa2.totalFisicosVendidos();

        // Ventas de libros virtuales de cada empresa
        empresa1.totalVirtualesVendidos();
        empresa2.totalVirtualesVendidos();

        // Stock de libros fisicos de cada empresa
        empresa1.librosFisicosSinStock();
        empresa2.librosFisicosSinStock();

    }
}
