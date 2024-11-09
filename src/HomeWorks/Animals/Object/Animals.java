package HomeWorks.Animals.Object;

import HomeWorks.Methods;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }
    public abstract void makeSound();

    public abstract void move();

    public void eat() {
        System.out.print(this);
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
