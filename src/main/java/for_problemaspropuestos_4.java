import java.util.Scanner;

public class for_problemaspropuestos_4 {
    public static void main(String[] args) {
        int cant,x,y,primer,segundo,tercer,cuarto;
        primer=0;segundo=0;tercer=0;cuarto=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de puntos que cargará: ");
        cant=sc.nextInt();
        for(int i=1;i<=cant;i++) {
            System.out.println("Ingrese el valor en x: ");
            x=sc.nextInt();
            System.out.println("Ingrese el valor en y: ");
            y=sc.nextInt();
            if (x>0 && y>0)
            {
                System.out.println("Coordenada ingresada.");
                primer++;
            } else if (x<0 && y>0) {
                System.out.println("Coordenada ingresada.");
                segundo++;
            } else if (x<0 && y<0) {
                System.out.println("Coordenada ingresada.");
                tercer++;
            } else if (x>0 && y<0) {
                System.out.println("Coordenada ingresada.");
                cuarto++;
            } else {
                System.out.println("Coordenada ingresada 0,0");
            }
        }
        System.out.println(primer + " son los puntos que corresponden al primer cuadrante");
        System.out.println(segundo + " son los puntos que corresponden al segundo cuadrante");
        System.out.println(tercer + " son los puntos que corresponden al tercer cuadrante");
        System.out.println(cuarto + " son los puntos que corresponden al cuarto cuadrante");
    }
}
