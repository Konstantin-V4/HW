package HomeWorks.Animals.Object;

public class Bird extends Animals{
    boolean canFly;

    public Bird(String name) {
        super(name);
        this.canFly = true;

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Чирик-чирик");
    }

    @Override
    public void eat() {
        System.out.println(super.toString() + ", Птица ест семена");
    }

    @Override
    public String toString() {
        return super.toString() + ", Может ли летать?: " + canFly;
    }
}
