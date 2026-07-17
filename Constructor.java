class Student
{
    //data members (instance variables)
    String name;
    int age;

    /*------------DEFAULT CONSTRUCTOR------------
   1. A default constructor is a constructor that takes no arguments. 
   2. It is called automatically when an object of the class is created ,without passing 
      any parameter to the constructor, the default constructor is called.
    */
    Student()
    {
        System.out.println("Default Constructor is called");
        name="John";           //Assigning default values to the instance variables
        age=20;
    }

    /*------------PARAMETERIZED CONSTRUCTOR------------
    1. A parameterized constructor is a constructor that takes arguments.
    2. It is used to initialize the instance variables with the values passed as arguments.
    */
    Student(String name, int age)
    {
        System.out.println("Parameterized Constructor is called");
        this.name=name;           //"this" keyword is used to refer to the current object's vaiables.
        this.age=age;
        System.out.println("Parameterized Constructor is called");
    }
        void display(){
        System.out.println("Name: " + this.name );
        System.out.println("Age: " + this.age);
        System.out.println();
    }

}
public class Constructor {

    public static void main(String args[])
    {
        //Creating an object of Student class using default constructor
        //Since we are not passing any parameter to the constructor, the default constructor is called.
        Student s1=new Student();
        s1.display();

        //Creating an object of Student class using parameterized constructor
        Student s2=new Student("Alice", 25);
        s2.display();
    }
}
