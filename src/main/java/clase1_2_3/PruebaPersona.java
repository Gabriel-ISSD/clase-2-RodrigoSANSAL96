package clase1_2_3;

public class PruebaPersona {
    public static void main(String[] args){
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        Persona persona1 = new Persona("Juan", 18);
        System.out.println("Nombre : "+ persona1.nombre);
        System.out.println("Edad : "+ persona1.edad);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        Persona persona2 = new Persona("Maria", 22);
        System.out.println("Nombre : "+ persona2.nombre);
        System.out.println("Edad : "+ persona2.edad);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        Persona persona3 = new Persona("Pedro", 23);
        System.out.println("Nombre : "+ persona3.nombre);
        System.out.println("Edad : "+ persona3.edad);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        Persona persona4 = new Persona("Jose", 21);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        System.out.println("Nombre : "+ persona4.nombre);
        System.out.println("Edad : "+ persona4.edad);
        Persona persona5 = new Persona("Maria", 30);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        System.out.println("Nombre : "+ persona5.nombre);
        System.out.println("Edad : "+ persona5.edad);
        Persona persona6 = new Persona("Pedro", 28);
        System.out.println("Valor de cantidad: "+Persona.cantidad);
        System.out.println("Nombre : "+ persona6.nombre);
        System.out.println("Edad : "+ persona6.edad);
    }
}