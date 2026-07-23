class College {
    String collegeName = "MUJ";
    String city = "Jaipur";

    class Department {
        void show() {
            System.out.println(collegeName);
            System.out.println(city);
        }
    }
}

public class Inner5 {
    public static void main(String[] args) {
        College c = new College();
        College.Department d = c.new Department();
        d.show();
    }
}
