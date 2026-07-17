class WrapperClass {
    public static void main(String[] args) {
        System.out.println("WRAPPER CLASS DEMO");

        int primitiveNum = 100;             //primitve variable
        System.out.println("Primitive int: " + primitiveNum);

        Integer obj1 =Integer.valueOf(primitiveNum);    //manual boxing
        System.out.println("Manual Boxing: " + obj1);
        System.out.println("Wrapper Integer object: " + obj1);
        Integer obj2=200;
        System.out.println("Autoboxing: " + obj2);   //autoboxing
        System.out.println("Integer object: " + obj2);
        int number1= obj2.intValue();   //manual unboxing
        System.out.println("Primitive int: " + number1);
        int number2=obj2;   //autounboxing
        System.out.println("Autounboxing Unboxing ");
        System.out.println("Primitive int: " + number2);
        String age="30";
        int convertedAge=Integer.parseInt(age);   //converting string to int
        System.out.println("Age+5= " + (convertedAge + 5));
        int marks= 85;
        String marksString=String.valueOf(marks);   //converting int to string
        System.out.println("Integer to string");
        System.out.println("String: " + marksString);

        //useful methods of wrapper class
        Integer a=50;
        Integer b=100;
        System.out .println("useful methods of wrapper class");
        System.out.println("Max value: " + Integer.max(a, b));
        System.out.println("Min value: " + Integer.min(a, b));
        System.out.println("Sum: " + Integer.sum(a, b));
        System.out.println("Compare: " + Integer.compare(a, b));

        //Character wrapper class
        Character c='A';
        System.out.println("Character Methods");
        System.out.println("Is letter?" + Character.isLetter(c));
        System.out.println("Is digit?" + Character.isDigit(c));
        System.out.println("Is whitespace?" + Character.isWhitespace(c));
        System.out.println("Is uppercase?" + Character.isUpperCase(c));
        System.out.println("Is lowercase?" + Character.isLowerCase(c));
        
        //Boolean wrapper class
        Boolean bool=true;
        System.out.println("Boolean Methods");
        System.out.println("Boolean value: " + bool);
        
        //Wrapper objects to primitive calculation
        Integer x=20;
        Integer y=30;
        int sum=x+y;   
        System.out.println("Calculation using wrapper objects: " + sum);
        
        //Wrapper class Constants
        System.out.println("Integer constants");
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Min value: " + Integer.MIN_VALUE);
}
}

