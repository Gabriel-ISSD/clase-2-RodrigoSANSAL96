package clase5.problemaPropuestoAnimal;

public class Perro extends Canino{

    public void comer(){
        super.comer();
        System.out.println("Felino comer");
    }

    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Felino hacerRuido");
    }

    public void vacunar(){
        System.out.println("Felino vacunar");
    }

    public void sacarPasear(){
        System.out.println("Felino sacarPasear");
    }
}
