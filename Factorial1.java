public class Factorial1
 {
    public static void main(String[] args)
    {
        int num1,fact=1,i;
        if (args.length==0)
        {
            System.out.println("no command line arguement");
            return;

        } num1=Integer.parseInt(args[8]);
        for(i=1;i<=num1;i++)
        {
            fact=fact*i;
        
        }
System.out.println("the factorial of a no is"+fact);
    }
    
}
