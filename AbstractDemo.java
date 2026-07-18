abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void play() {
        System.out.println("Play music");

    }
}

abstract class Wagon extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

class UpdatedWagon extends Wagon {
    public void fly() {
        System.out.println("Flying");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Car obj = new UpdatedWagon();
        obj.drive();
        obj.play();
        obj.fly();
    }

}
