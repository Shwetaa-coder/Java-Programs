class Student {
    void name() {
        System.out.println("Naavi");
    }

    class Marks {
        void marks() {
            System.out.println("marks is 90");
        }
    }
}

public class InnerP2 {
    public static void main(String[] args) {
        Student s = new Student();
        Student.Marks i = s.new Marks();
        s.name();
        i.marks();
    }
}
