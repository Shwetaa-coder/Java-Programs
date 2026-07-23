abstract class Vehcile {
    abstract void start();
}

class Am {
    public static void main(String[] args) {
        Vehcile v = new Vehcile() {
            void start() {
                System.out.println("running");
            }
        };
        v.start();
    }
}
