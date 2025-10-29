package clase7.problema5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("Rodrigo",28);
        mapa.put("German",30);
        mapa.put("Nicolas",32);

        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + " - Edad: " + entrada.getValue());
        }
    }
}
