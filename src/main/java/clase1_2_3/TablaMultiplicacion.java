package clase1_2_3;

public class TablaMultiplicacion {
    private int tabla;

    public TablaMultiplicacion(int ta) {
        tabla = ta;
    }

    public void imprimir(){
        for (int i=0; i<=10;i++){
            int resultado=tabla*i;
            System.out.println(tabla + " * " + i + " = " + resultado);
        }
    }

    public static void main(String[] args){
        TablaMultiplicacion obj=new TablaMultiplicacion(3);
        obj.imprimir();

        TablaMultiplicacion obj2=new TablaMultiplicacion(5);
        obj2.imprimir();
    }
}
