package clase7.problema3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Persona> personas = new HashMap<>();

        personas.put(123456789, new Persona("Kenny"));
        personas.put(3216544, new Persona("Cartman"));
        personas.put(5554687, new Persona("Randy"));

        System.out.println(personas.get(123456789).getNombre());
        System.out.println(personas.get(3216544).getNombre());
        System.out.println(personas.get(5554687).getNombre());
    }
}
