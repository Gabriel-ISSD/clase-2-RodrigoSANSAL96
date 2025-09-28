package clase1_2_3;

import java.util.Scanner;

public class for_problemaspropuestos_3 {
    public static void main(String[] args) {
        int valor,resultado;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un valor entre el 1 y el 10: ");
        valor=sc.nextInt();
        if (valor >= 1 && valor <= 10) {
            for(int i=1;i<=12;i++) {
                resultado = valor*i;
                System.out.print(resultado + " ");
            }
        }else{
            System.out.println("Valor incorrecto");
        }
    }
}
