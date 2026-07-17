class Student {
    //instance variables
    String name;
    int rollno;
    //static variable
    //static variable is shared among all objects of the class
    static String college="XYZ College";
    static int count=0; //static variable to keep track of number of students

    //-------Static Block--------
    //Executes only once when the class is loaded into memory
    //before the main method is executed
    static {
        System.out.println("Static Block is executed");
        college="ABC College"; //Assigning value to static variable
    }
    //----Constructor----
    Student(String name, int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        count++; //Incrementing the count of students
    }
    //instance method to display student details
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("College: "+college);
        System.out.println();
    }
    //-----Static Method-----
    //Static method can access only static variables and static methods
    //Static method cannot access instance variables and instance methods
    //Static methods belong to the class rather than to any specific object of the class
    static void displayCount()
    {
        System.out.println("College Name : "+college);
        System.out.println("Total number of students: "+count);
    }
}
public class Static {
    public static void main(String args[])
    {
        //Creating objects of Student class
        Student s1=new Student("John", 101);
        Student s2=new Student("Alice", 102);
        Student s3=new Student("Bob", 103);

        //Displaying student details using instance method
        s1.display();
        s2.display();
        s3.display();

        //Displaying total number of students using static method
        Student.displayCount();

        //Changing static variables
        Student.college="PQR College"; //Changing the value of static variable
        System.out.println("After changing college name:");
        //Displaying student details again to see the effect of changing static variable
        s1.display();
        s2.display();
        s3.display();
        Student.displayCount();   //Static method again

    }
}
