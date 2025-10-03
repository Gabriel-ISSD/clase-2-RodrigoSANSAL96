package clase5.problemaPropuestoPunto;

public class Punto2D {
    protected int x,y;

    public Punto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Los puntos son: "+ x + ";" + y);
    }
}
