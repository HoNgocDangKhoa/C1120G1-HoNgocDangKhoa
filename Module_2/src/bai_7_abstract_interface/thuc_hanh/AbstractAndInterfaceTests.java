package bai_7_abstract_interface.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible=(Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Orange();
        for (Fruit fruit1: fruit){
            if(fruit1 instanceof Apple){
                System.out.println(fruit1.howToEat());
            }
        }

    }
}
