class Outer {
    class Inner {
        void display() {
            System.out.println("from inner");
        }

    }
}

class InnerP {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}