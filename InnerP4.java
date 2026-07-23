class Employee {
    private int sal = 14000;

    class Salary {
        void show() {
            System.out.println("Salary : " + sal);
        }
    }
}

public class InnerP4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee.Salary s = e.new Salary();
        s.show();
    }
}
