//Create a class with private data memebers
class Student {
    //private variables (cannot be accessed from outside the class)
    private String name;
    private int age;
    
    //Creating setter methods
    public void setName(String name) {
        this.name = name;               //this.name refers to the instance variable
    }
    public void setAge(int age) {
        this.age = age;                 //this.age refers to the instance variable
    }
    //Creating getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String args[]) {
        //Creating an object of Student class
        Student s = new Student();
        
        //Setting values to the private variables using setter methods
        s.setName("John");
        s.setAge(20);
        
        //Getting values of the private variables using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}


