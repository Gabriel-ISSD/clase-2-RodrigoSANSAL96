package clase4;

public class Arraymeses {
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio"
    , "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private int[] dias = {31,28,31,30,31,30,331,1,30,31,30,31};

    public void imprmir(){
        for(int i=0;i<dias.length;i++){
                if(31==dias[i]){
                    System.out.print(meses[i]+" ");
                }
            }
    }

    public static void main(String[] args) {
        Arraymeses m = new Arraymeses();
        m.imprmir();
    }
}
