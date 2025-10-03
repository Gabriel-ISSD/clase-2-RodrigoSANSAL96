package clase5.problemaPropuestoPunto;

public class Main {

    public static void main(String[] args) {
        Punto2D punto2D = new Punto2D(5,9);

        punto2D.imprimir();

        punto2D.setX(1);
        punto2D.setY(2);
        punto2D.imprimir();

        Punto3D punto3D = new Punto3D(5, 6, 7);
        punto3D.imprimir();

        punto3D.setZ(3);
        punto3D.imprimir();
    }
}
