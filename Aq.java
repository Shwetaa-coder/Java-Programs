abstract class Shape {
    abstract void draw();
}

class Aq {
    public static void main(String[] args) {
        Shape c = new Shape() {
            void draw() {
                System.out.println("circle");
            }
        };
        Shape rec = new Shape() {
            void draw() {
                System.out.println("rectamgle");
            }
        };
        c.draw();
        rec.draw();
    }
}
