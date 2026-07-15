public class Loops {
    public static void main(String a[])
    {
//1. FOR LOOP
//Used when the number of iterations is known.
//Syntax: for(initialization; condition; increment/decrement)

        System.out.println("FOR LOOP");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i = " + i);
        }
        System.out.println("");
        //2. WHILE LOOP
        //Used when the number of iterations is unknown.    
        //Syntax: while(condition)
        System.out.println("WHILE LOOP");
        int j = 1;
        while(j <= 5)
        {
            System.out.println("j = " + j);
            j++;
        }
        System.out.println("");
        //3. DO-WHILE LOOP
        //Executes the code block at least once, then checks the condition.
        //Syntax: do { //code } while(condition)
        System.out.println("DO-WHILE LOOP");
        int k = 1;
        do
        {
            System.out.println("k = " + k);
            k++;
        } while(k <= 5);
        System.out.println("");
        //4. ENHANCED FOR LOOP
        //Used to iterate through arrays or collections.
        //Syntax: for(dataType variable : array/collection)
        System.out.println("ENHANCED FOR LOOP");
        int[] numbers = {1, 2, 3, 4, 5};
        for(int n : numbers)
        {
            System.out.println("n = " + n);
        }
        //5. NESTED FOR LOOP
        //A loop inside another loop.   
        //Syntax: for(initialization; condition; increment/decrement) { for(initialization; condition; increment/decrement) { //code } }
        System.out.println("");
        System.out.println("NESTED FOR LOOP");
        for(int p=1;p<=3;p++)
        {
            for(int q=1;q<=3;q++)
            {
                System.out.println("p = " + p + ", q = " + q);
            }
        }
        //6. BREAK STATEMENT
        //Used to exit a loop prematurely.
        //Syntax: break;
        System.out.println("");
        System.out.println("BREAK STATEMENT");
        for(int r=1;r<=5;r++)
        {
            if(r == 3)
            {
                break;
            }
            System.out.println("r = " + r);
        }
        //7. CONTINUE STATEMENT
        //Used to skip the current iteration and continue with the next iteration.
        //Syntax: continue;
        System.out.println("");
        System.out.println("CONTINUE STATEMENT");
        for(int s=1;s<=5;s++)
        {
            if(s == 3)
            {
                continue;
            }
            System.out.println("s = " + s);
        }
        //8. LABELLED STATEMENT
        //Used to label a loop and break or continue to that label.
        //Syntax: label: for(initialization; condition; increment/decrement) { //code }
        System.out.println(""); 
        System.out.println("LABELLED STATEMENT");
        outer: for(int t=1;t<=3;t++)
        {
            for(int u=1;u<=3;u++)
            {
                if(u == 2)
                {
                    break outer;
                }
                System.out.println("t = " + t + ", u = " + u);
            }
        }   
    }
}
