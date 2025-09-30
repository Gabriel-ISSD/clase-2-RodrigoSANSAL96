package clase5.problemaPropuestoLibro;

import java.util.Scanner;

public class Libro {
    protected String titulo, autor, editorial;
    protected int paginas;
    protected Scanner teclado;

    public Libro(){
        teclado = new Scanner(System.in);
    }

    public void cargar(){
        System.out.println("Ingrese el titulo del libro");
        titulo = teclado.nextLine();
        System.out.println("Ingrese el autor del libro");
        autor = teclado.nextLine();
        System.out.println("Ingrese el editorial del libro");
        editorial = teclado.nextLine();
        System.out.println("Ingrese el cantidad de paginas del libro");
        paginas = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Paginas: " + paginas);
    }
}
