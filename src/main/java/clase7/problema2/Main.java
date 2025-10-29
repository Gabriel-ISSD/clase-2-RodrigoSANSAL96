package clase7.problema2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,Double> mapa = new HashMap<>();
        mapa.put("pi", 3.1415);
        mapa.put("e", 2.7182);
        mapa.put("GoldenRatio", 1.6180);

        for(Map.Entry<String,Double> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("El tamaño del mapa es de: " + mapa.size());
        System.out.println(mapa.containsValue(1.6180));
        System.out.println(mapa.containsKey("phi"));
        System.out.println(mapa.isEmpty());
    }
}
