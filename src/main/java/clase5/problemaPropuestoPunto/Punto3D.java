package clase5.problemaPropuestoPunto;

public class Punto3D extends Punto2D{
    protected int z;

    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void imprimir() {
        System.out.println("Punto3D: "+x+";"+y+";"+z);
    }
}
