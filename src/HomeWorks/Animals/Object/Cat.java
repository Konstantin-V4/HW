package HomeWorks.Animals.Object;

public class Cat extends Animals{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(", Кошка ест рыбу");
    }
}
