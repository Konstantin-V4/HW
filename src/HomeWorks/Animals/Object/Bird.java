package HomeWorks.Animals.Object;

public class Bird extends Animals {
    boolean canFly;

    public Bird(String name) {
        super(name);
        this.canFly = true;
    }

    @Override
    public void makeSound() {
        System.out.println(super.toString() + ", Звук животного: Чирик-чирик" + this);
    }

    @Override
    public void move() {
        if (canFly == true) {
            System.out.println(super.toString() + ", Птица летает");
        } else if (canFly == false) {
            System.out.println(super.toString() + ", Птица не летает");
        }
    }

    @Override
    public void eat() {
        System.out.println(super.toString() + ", Птица ест семена");
    }

    @Override
    public String toString() {
        return ", Может ли летать?: " + canFly;
    }
}
