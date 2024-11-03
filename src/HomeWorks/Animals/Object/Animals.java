package HomeWorks.Animals.Object;

import HomeWorks.Methods;

public class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(this);
    }
    public void eat() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Животное: " + name;
    }
}
