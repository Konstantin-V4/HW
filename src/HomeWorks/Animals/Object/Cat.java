package HomeWorks.Animals.Object;

public class Cat extends Animals{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this + ", Звук животного: Мяу");
    }

    @Override
    public void eat() {
        System.out.println(this + ", Кошка ест рыбу");
    }
}
