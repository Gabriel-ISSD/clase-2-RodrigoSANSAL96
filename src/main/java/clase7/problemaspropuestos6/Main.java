package clase7.problemaspropuestos6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer,Articulo> mapa = new HashMap<>();
        Map<Integer,Integer> mapa2 = new HashMap<>();

        mapa.put(10, new Articulo("Harina",100.0));
        mapa.put(11, new Articulo("Fideos",150.0));
        mapa.put(12, new Articulo("Aceite",400.0));
        mapa.put(13, new Articulo("Yerba",700.0));
        mapa.put(20, new Articulo("Fernet",900.0));
        mapa.put(30, new Articulo("Coca-Cola",400.0));
        System.out.println("---------INVENTARIO---------");
        System.out.println("Código"+ "-"  + "Nombre" + "-" + "Precio");
        for (Map.Entry<Integer, Articulo> entry : mapa.entrySet()) {
            Articulo art = entry.getValue();
            System.out.println(entry.getKey() + " - " + art.getNombre() + " - " + art.getPrecio());
        }

        System.out.println("Ingrese codigos de articulos, para finalizar ingrese '0'");
        while(true){
            System.out.print("Código: ");
            int codigo = teclado.nextInt();

            if (codigo == 0) break; // condición de salida

            if (mapa.containsKey(codigo)) {
                // Si ya está en la factura, sumo 1
                mapa2.put(codigo, mapa2.getOrDefault(codigo, 0) + 1);
                System.out.println(mapa.get(codigo).getNombre() + " agregado a la factura.");
            } else {
                System.out.println("Código no encontrado en el inventario.");
            }
        }

        System.out.println("\n--------- FACTURA ---------");
        double total = 0;

        for (Map.Entry<Integer, Integer> entry : mapa2.entrySet()) {
            int codigo = entry.getKey();
            int cantidad = entry.getValue();
            Articulo art = mapa.get(codigo);

            double subtotal = art.getPrecio() * cantidad;
            total += subtotal;

            System.out.println(cantidad + " x " + art.getNombre() + " ($" + art.getPrecio() + " c/u) = $" + subtotal);
        }

        System.out.println("----------------------------");
        System.out.println("TOTAL: $" + total);
    }
}
