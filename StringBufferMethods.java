class StringBufferMethods {
    public static void main(String args[])
    {
    //Creating a string buffer object
        StringBuffer sb =new StringBuffer("Hello");

        //Appending the string
        sb.append(" World");
        System.out.println("append():" + sb);

        //Inserting the string
        sb.insert(5, " Java");
        System.out.println("insert():" + sb);

        //Replacing the string
        sb.replace(5, 10, " C++");
        System.out.println("replace():" + sb);

        //Deleting the string
        sb.delete(5, 10);
        System.out.println("delete():" + sb);

        //deleting the character at the specified index
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt():" + sb);

        //Reversing the string
        System.out.println("reverse():" + sb.reverse());

        //Reverse the string again to get the original string
        System.out.println("reverseAgain():" + sb.reverse());

        //Capacity of the string buffer
        System.out.println("capacity():" + sb.capacity());

        //Length of the string buffer
        System.out.println("length():" + sb.length());

        //Character at the specified index
        System.out.println("charAt():" + sb.charAt(0));

        //Set the character at the specified index
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt():" + sb);

        //Substring of the string buffer
        System.out.println("substring():" + sb.substring(1));
        System.out.println("substring():" + sb.substring(0, 5));

        //Index of the specified string
        System.out.println("indexOf():" + sb.indexOf("World"));

        //Last index of the specified string
        System.out.println("lastIndexOf():" + sb.lastIndexOf("World"));

        //Ensure capacity of the string buffer
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity():" + sb.capacity());

        //Trim the capacity of the string buffer
        sb.trimToSize();
        System.out.println("trimToSize():" + sb.capacity());

        //toString() method of the string buffer
        String str = sb.toString();
        System.out.println("toString():" + sb.toString());


    }
    
    
}
