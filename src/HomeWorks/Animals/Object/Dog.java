package HomeWorks.Animals.Object;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this + ", Звук животного: Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println(this + ", Собака ест кость");
    }

}
