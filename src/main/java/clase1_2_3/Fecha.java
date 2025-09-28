package clase1_2_3;

public class Fecha {
    private int dia, mes, año;

    public Fecha(){
        dia= 01;
        mes=01;
        año=2000;
    }

    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        año = a;
    }

    public void imprimir(){
        System.out.println("La fecha es: "+ dia + "/" + mes + "/" + año);
    }

    public void semestre(){
        if (mes < 6){
            System.out.println("La fecha corresponde al primer semestre");
        }else{
            System.out.println("La fecha corresponde al segundo semestre");
        }
    }

    public void navidad(){
        if (dia == 25 && mes == 12){
            System.out.println("La fecha corresponde a Navidad");
        }else{
            System.out.println("La fecha no corresponde a Navidad");
        }
    }

    public static void main(String[] args){
        Fecha fechaIngresada = new Fecha();
        Fecha fechaIngresada2 = new Fecha(25,12,2000);
        fechaIngresada2.imprimir();
        fechaIngresada2.semestre();
        fechaIngresada2.navidad();
        fechaIngresada.imprimir();
        fechaIngresada.semestre();
        fechaIngresada.navidad();

    }
}
