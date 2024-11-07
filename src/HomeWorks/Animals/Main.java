package HomeWorks.Animals;

import HomeWorks.Animals.Object.*;

public class Main {
    public static void main(String[] args) {

        Animals dog1 = new Dog("Собака");
        Animals cat1 = new Cat("Кошка");
        Animals bird1 = new Bird("Птица");

        Animals[] animals = {dog1, cat1, bird1};
        for (Animals animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.move();

            if (animal instanceof Pet) {
                ((Pet) animal).play();
                ((Pet) animal).beFriendly();
            }
        }
    }
}
