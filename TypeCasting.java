class TypeCasting {
    public static void main(String args[]) {
        int a = 100;
        double b = a;              // implicit widening conversion
        int c = (int) b;           // explicit narrowing conversion
        byte d = (byte) 130;       // narrowing conversion with overflow

        System.out.println("int to double: " + b);
        System.out.println("double to int: " + c);
        System.out.println("int to byte: " + d);
    }
}