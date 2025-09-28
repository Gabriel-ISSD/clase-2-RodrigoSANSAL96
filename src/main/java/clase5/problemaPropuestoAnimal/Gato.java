package clase5.problemaPropuestoAnimal;

public class Gato extends Felino{

    public void comer(){
        super.comer();
        System.out.println("Gato Comiendo");
    }

    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Gato HacerRuido");
    }

    public void vacunar(){
        System.out.println("Gato Vacunar");
    }

}
