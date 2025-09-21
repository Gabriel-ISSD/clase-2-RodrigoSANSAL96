package clase4;

public class ArrayBidimensional4x4 {
    private int [][] arraybi;
    private int principal, secundaria, indice, parametro, salto;
    private float suma, promedio;

    public ArrayBidimensional4x4() {
        arraybi = new int[4][4];
        salto = 0;
        for (int i=0;i<4;i++){
            salto = 0;
            for (int j=0;j<4;j++){
                if (i>0 && salto==0){
                    System.out.println();
                    salto++;
                }
                arraybi[i][j]= 1 + (int)(Math.random()*9);
                System.out.print(arraybi[i][j]+" ");
            }
        }
        System.out.println();
    }

    public void sumaprincipal(){
        principal = 0;
        principal = arraybi[0][0] + arraybi[1][1] + arraybi[2][2] + arraybi[3][3];
        System.out.println("La suma de la diagonal principal es:  "+principal);
    }

    public void sumapsecundaria(){
        secundaria = 0;
        secundaria= arraybi[0][3]  + arraybi[1][2] + arraybi[2][1] + arraybi[3][0];
        System.out.println("La suma de la diagonal secundaria es:  "+secundaria);
    }

    public void sumaparametro(int para){
        indice = para;
        parametro = 0;
        parametro = arraybi[indice][0] + arraybi[indice][1] + arraybi[indice][2] + arraybi[indice][3];
        System.out.println("La suma de la fila por parametro es:  "+parametro);
    }

    public void promedio(){
        suma = 0;
        promedio = 0;
        for (int i=0;i<4;i++){
            for  (int j=0;j<4;j++){
                suma = suma + arraybi[i][j];
            }
        }
        promedio = suma/16;
        System.out.println("El promedio es:  "+promedio);
    }
    public static void main(String[] args) {
        ArrayBidimensional4x4 obj = new ArrayBidimensional4x4();
        obj.sumaprincipal();
        obj.sumapsecundaria();
        obj.sumaparametro(1);
        obj.promedio();

    }
}
