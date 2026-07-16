class calculator{
    public int add(int x,int y)
    {
        return x+y;
    }
    public int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public double add(double x,double y)
    {
        return x+y;
    }
}
class MethodOverloading {
    public static void main(String args[])
    {
        calculator c=new calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5,20.5));
    }
    
}
