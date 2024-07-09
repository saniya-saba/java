public class Number 
 {
    public static void main(String args[])
    {
        int[] a=new int[10];
        int fact;
        if(args.length==0)
        {
            System.out.println("no command line arguments");
            return;

        }
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<args.length;i++)
    }
    for(int i=0;i<args.length;i++)
    {
    fact=1;
        while(a[i]>0)
        {
            fact=fact*a[i];
        a[i]--;
    }
    System.out.println("factorial of"+args[i]+"is:"+fact);

    }
}

}
    

