package clase1_2_3;

public class NumeroAleatorio {
    private int minimo,maximo;

    public NumeroAleatorio(int min, int max){
        minimo=min;
        maximo=max;
    }

    public int retornar(){
        int rango = maximo - minimo + 1;
        int valor = minimo + (int) (Math.random() * rango);
        return valor;
    }

    public static void main(String[] args) {
        NumeroAleatorio n1 = new NumeroAleatorio(10,20);
        for(int i=0; i<10;i++){
            System.out.println(n1.retornar());
        }
    }
}
