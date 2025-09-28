package clase5.problemaPropuestoAnimal;

public class Canino extends Animal{

    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Felino hacerRuido");
    }

    public void caer(){
        super.caer();
        System.out.println("Felino caer");
    }
}
