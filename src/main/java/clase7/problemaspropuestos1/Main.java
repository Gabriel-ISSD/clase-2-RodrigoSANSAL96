package clase7.problemaspropuestos1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

        for  (int i = 0; i < 5; i++){
            System.out.println("Cargar los paises");
            String pais = teclado.nextLine();
            System.out.println("Cargar sus capitales");
            String capital = teclado.nextLine();
            mapa.put(pais, capital);
        }

        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println("País: " + entrada.getKey() + " - Capital: " + entrada.getValue());
        }
    }
}
