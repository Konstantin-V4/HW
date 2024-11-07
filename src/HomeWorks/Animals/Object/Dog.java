package HomeWorks.Animals.Object;

public class Dog extends Animals implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.toString() + ", Звук животного: Гав-гав");
    }

    @Override
    public void move() {
        System.out.println(super.toString() + ", Собака ходит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(", Собака ест кость");
    }

    @Override
    public void play() {
        System.out.println("Собака играет с костью");
    }

    @Override
    public void beFriendly() {
        System.out.println("Поведение дружелюбное");
    }
}
