package HomeWorks.Animals;

import HomeWorks.Animals.Object.Animals;
import HomeWorks.Animals.Object.Bird;
import HomeWorks.Animals.Object.Cat;
import HomeWorks.Animals.Object.Dog;

public class Main {
    public static void main(String[] args) {

        Animals dog1 = new Dog("Собака");
        Animals cat1 = new Cat("Кошка");
        Animals bird1 = new Bird("Птица");

        Animals[] animals = {dog1, cat1, bird1};
        for (Animals animal : animals) {
            animal.makeSound();
        }

        Animals[] animalsEat = {dog1, cat1, bird1};
        for (Animals animal : animalsEat) {
            animal.eat();
        }
    }
}
