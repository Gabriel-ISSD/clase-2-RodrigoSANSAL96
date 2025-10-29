package clase7.problema7;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la calificación del alumno");
            Integer calificacion = teclado.nextInt();
            teclado.nextLine();
            mapa.put(nombre, calificacion);
        }

        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
}
