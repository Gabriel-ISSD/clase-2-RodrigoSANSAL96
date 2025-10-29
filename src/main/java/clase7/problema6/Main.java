package clase7.problema6;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Double> numeros = new HashMap<>();

        for (int i = 1; i < 6; i++) {
            numeros.put(i, Math.pow(i, 3));
        }

        for (Double valor : numeros.values()) {
            System.out.println(valor);
        }
    }
}
