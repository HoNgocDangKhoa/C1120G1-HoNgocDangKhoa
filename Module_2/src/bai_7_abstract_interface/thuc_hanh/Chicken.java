package bai_7_abstract_interface.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "gà bó xôi";
    }

    @Override
    public String makeSound() {
        return "Chicken : cục tác cục tác";
    }
}
