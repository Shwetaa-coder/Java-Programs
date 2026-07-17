class Student{
    void display() {
        System.out.println("hello i am anonymous object");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new Student().display();     //Anonymous object is created and method is called
    }
    
}
