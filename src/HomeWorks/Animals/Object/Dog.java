package HomeWorks.Animals.Object;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(", Собака ест кость");
    }

}
