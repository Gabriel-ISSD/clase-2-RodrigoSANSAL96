package clase7.problema8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Tarjeta> mapa = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular:");
        String nombre = teclado.nextLine();

        long numeroTarjeta;

        // Validación del número
        while (true) {
            System.out.println("Ingrese el número de tarjeta de crédito:");
            numeroTarjeta = teclado.nextLong();

            if (numeroTarjeta > 4000_0000_0000_0000L && numeroTarjeta < 6000_0000_0000_0000L) {
                break; // número válido
            } else {
                System.out.println("❌ Número inválido. Debe estar entre 4 y 6 cuatrillones. Intente nuevamente.");
            }
        }

        // Determinar tipo de tarjeta
        String tipo;
        if (String.valueOf(numeroTarjeta).startsWith("4")) {
            tipo = "Visa";
        } else if (String.valueOf(numeroTarjeta).startsWith("5")) {
            tipo = "Master";
        } else {
            tipo = "Desconocida";
        }

        // Crear y guardar la tarjeta
        Tarjeta tarjeta = new Tarjeta(tipo, numeroTarjeta);
        mapa.put(nombre, tarjeta);

        // Imprimir usando iterador y entrySet
        System.out.println("\n--- Tarjetas registradas ---");
        Iterator<Map.Entry<String, Tarjeta>> iterador = mapa.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, Tarjeta> entrada = iterador.next();
            System.out.println("Titular: " + entrada.getKey() + " - " + entrada.getValue());
        }

        teclado.close();
    }
}
