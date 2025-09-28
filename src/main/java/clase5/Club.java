package clase5;

public class Club {
    private Socio socio1, socio2, socio3;

    public Club() {
        socio1 = new Socio();
        socio2 = new Socio();
        socio3 = new Socio();
    }

    public void imprimir(){
        Socio socioMayor = socio1;
        if(socio2.getAntiguedad() > socioMayor.getAntiguedad()){
            socioMayor = socio2;
        }

        if(socio3.getAntiguedad() > socioMayor.getAntiguedad()){
            socioMayor = socio3;
        }

        System.out.println("El socio con mayor antiguedad es: "+ socioMayor.getNombre() + " con " + socioMayor.getAntiguedad() + " años en el club");
    }

    public static void main(String[] args) {
        Club c = new Club();
        c.imprimir();
    }
}
