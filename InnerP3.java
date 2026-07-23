class Car {
    class Engine {
        void show() {
            System.out.println("Engine started");
        }
    }
}

public class InnerP3 {
    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e = c.new Engine();
        e.show();
    }
}
