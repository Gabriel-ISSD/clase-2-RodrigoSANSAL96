package clase7.problemapropuestos2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer[]> mapa = new HashMap<>();
        mapa.put("Rojo", new Integer[]{255, 0, 0});
        mapa.put("Verde", new Integer[]{0, 255, 0});
        mapa.put("Azul", new Integer[]{0, 0, 255});
        mapa.put("Naranja", new Integer[]{220,50,45});
        mapa.put("Amarillo", new Integer[]{220,80,100});
    }
}
