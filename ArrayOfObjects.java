class Student {
    String name;
    int marks;
    int rollno;
    }

public class ArrayOfObjects {
    
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="Ravi";
        s1.marks=80;
        s1.rollno=101;

        Student s2=new Student();
        s2.name="Ramesh";
        s2.marks=90;
        s2.rollno=102;

        Student s3=new Student();
        s3.name="Suresh";
        s3.marks=70;
        s3.rollno=103;

        Student arr[]=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for(int i=0;i<3;i++)
        {
            System.out.println("Name: "+arr[i].name);
            System.out.println("Marks: "+arr[i].marks);
            System.out.println("Roll No: "+arr[i].rollno);
            System.out.println();
        }
    }
    
}
