package clase7.problema1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Duster", "Renault");
        mapa.put("Clio", "Renault");
        mapa.put("Tracker", "Chevrolet");
        mapa.put("206", "Peugeot");
        mapa.put("Ka", "Ford");

        System.out.println(mapa.get("206"));
    }
}
