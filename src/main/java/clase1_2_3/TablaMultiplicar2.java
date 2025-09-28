package clase1_2_3;

public class TablaMultiplicar2 {
    private int valor;

    public TablaMultiplicar2(int va) {
        valor = va;
    }

    public void imprimir(){
        for (int i = 1; i <= 10; i++){
            int resultado = valor * i;
            System.out.println(valor+ " * " + i + " : "+resultado);
        }
    }
    public void imprimir(int cant){
        for (int i = 1; i <= cant; i++){
            int resultado = valor * i;
            System.out.println(valor+ " * " + i + " : "+resultado);
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar2 tabla = new TablaMultiplicar2(3);
        tabla.imprimir();
        tabla.imprimir(4);
    }
}
