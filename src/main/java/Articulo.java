public class Articulo {
    private String nombre;
    private float precio;
    private int stock;

    public Articulo(String nomb, float pre, int sto){
        nombre = nomb;
        precio = pre;
        stock = sto;
    }

    public void imprimir(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Precio: " +precio);
        System.out.println("Stock actual: " +stock);
    }

    public int retornarStock(){
        return stock;
    }

    public static void main(String[] args){
        Articulo art1 = new Articulo("Leche", 5000, 13);
        Articulo art2 = new Articulo("Cafe", 3500, 9);
        if(art1.retornarStock() < 10){
            System.out.println("Hay que reponer stock");
            art1.imprimir();
        }
        if(art2.retornarStock() < 10){
            System.out.println("Hay que reponer stock");
            art2.imprimir();
        }
    }
}
