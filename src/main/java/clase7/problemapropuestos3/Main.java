package clase7.problemapropuestos3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> mapa = new TreeMap<>();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el apellido del alumno (o 'finalizar' para terminar):");
            String apellido = teclado.nextLine();

            if (apellido.equalsIgnoreCase("finalizar")) {
                System.out.println("Carga finalizada.");
                break;
            }

            if (mapa.containsKey(apellido)) {
                System.out.println("El apellido ya existe. Se eliminará del registro.");
                mapa.remove(apellido);
            } else {
                System.out.println("Ingrese la calificación del alumno:");
                Integer calificacion = teclado.nextInt();
                teclado.nextLine();
                mapa.put(apellido, calificacion);
            }
        }

        System.out.println("Listado de alumnos y calificaciones (orden alfabético):");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
