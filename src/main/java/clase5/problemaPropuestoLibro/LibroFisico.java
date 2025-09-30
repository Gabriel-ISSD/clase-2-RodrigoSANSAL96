package clase5.problemaPropuestoLibro;

public class LibroFisico extends Libro {
    protected int stock, ventas, sinStock;

    public void stock(){
        System.out.println("Ingrese la cantidad de Stock de libros Fisicos: ");
        stock = teclado.nextInt();
    }

    public void cargarDatosFisico() {
        cargar();
        System.out.print("Ingrese el stock inicial: ");
        stock = teclado.nextInt();

        System.out.print("Ingrese la cantidad de ventas realizadas: ");
        ventas = teclado.nextInt();
    }

    public int sinStock(){
        if(ventas > stock){
            System.out.println("No hay stock");
            sinStock = ventas - stock;
            System.out.println("Cantidad de libros fisicos sin stock: " + sinStock);
        }else{
            stock = stock - ventas;
        }
        return stock;
    }
    public void imprimir(){
        System.out.println("Stock: "+stock);
        System.out.println("Ventas: "+ventas);
    }

    public int getVentas() {
        return ventas;
    }

}
