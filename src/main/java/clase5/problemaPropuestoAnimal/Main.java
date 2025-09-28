package clase5.problemaPropuestoAnimal;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        Leon leon1 = new Leon();
        leon1.comer();
        leon1.dormir();
        leon1.hacerRuido();
        leon1.caer();
    }
}
