 class Calculator
 {
    public int add(int a, int b)
    {
        return a+b;
    }
 }
 
 
 class Classs {
    public static void main(String[] args) {
        int num1 =4;
        int num2 =5;
        Calculator calc = new Calculator();
        int result= calc.add(num1,num2);                
        System.out.println("Addition of "+num1+" and "+num2+" is: "+result);        
    }
    
}
