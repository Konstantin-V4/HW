package HomeWorks.Animals.Object;

public class Bird extends Animals{
    boolean canFly;

    public Bird(String name) {
        super(name);
        this.canFly = true;

    }

    @Override
    public void makeSound() {
        System.out.println(this + ", Звук животного: Чирик-чирик");
    }

    @Override
    public void eat() {
        System.out.println(this + ", Птица ест семена");
    }

    @Override
    public String toString() {
        return super.toString() + ", Может ли летать?: " + canFly;
    }
}
