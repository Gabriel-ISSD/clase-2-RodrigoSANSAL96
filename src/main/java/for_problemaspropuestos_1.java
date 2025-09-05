import java.util.Scanner;

public class for_problemaspropuestos_1 {
    public static void main(String[] args) {
        int num, i, suma;
        Scanner sc = new Scanner(System.in);

        suma=0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if (i > 5){
                suma=suma+num;
            }
        }
        System.out.println("La suma de los ultimos 5 numeros ingresados es: "+suma);
    }
}
