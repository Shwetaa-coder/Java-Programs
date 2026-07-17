class Student
{
    private String name;
    private int age;

    //Setter method for name
    public void setName(String name)
    {
        this.name=name;
    }
    //Setter method for age
    public void setAge(int age)
    {
        this.age=age;
    }
    //Getter method for name
    public String getName()
    {
        return name;
    }
    //Getter method for age
    public int getAge()
    {
        return age;
    }
}
public class GettersAndSetters {
    
    Student s=new Student();
    public static void main(String args[])
    {
        Student s=new Student();
        s.setName("John");          //Setting the name using setter method
        s.setAge(20);

        System.out.println("Name: "+s.getName());       //Getting the name using getter method
        System.out.println("Age: "+s.getAge());


    }
}
