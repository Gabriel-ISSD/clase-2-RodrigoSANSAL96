package clase1_2_3;

public class Usuariothis {
    private String nombre;
    private String clave;

    public Usuariothis(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public void imprimir(){
        System.out.println(nombre);
        System.out.println(clave);
    }

    public static void main(String[] args){
        Usuariothis usuario1= new Usuariothis("Rodrigo", "1234");
        Usuariothis usuario2= new Usuariothis("German", "acasd");
        usuario1.imprimir();
        usuario2.imprimir();

    }
}
