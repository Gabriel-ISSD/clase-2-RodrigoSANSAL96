package clase1_2_3;

public class Cuadrado2 {
    private int lado;

    public Cuadrado2(int la){
        lado = la;
    }

    public String retornar(){
        int superficie = lado*lado;
        if(superficie>100){
            return "El cuadrado es grande";
        }else{
            return "El cuadrado es chico";
        }
    }

    public static void main(String[] args){
        Cuadrado2 ladoIngresado = new Cuadrado2(10);
        System.out.println(ladoIngresado.retornar());
    }
}
