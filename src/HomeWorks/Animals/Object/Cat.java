package HomeWorks.Animals.Object;

public class Cat extends Animals implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.toString() + ", Звук животного: Мяу");
    }

    @Override
    public void move() {
        System.out.println(super.toString() + ", Кошка ходит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(", Кошка ест рыбу");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с клубком");
    }

    @Override
    public void beFriendly() {
        System.out.println("Поведение недружелюбное");
    }
}
