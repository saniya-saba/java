class prime
{
public static void main(Sting args[])
{
int i,j,num1,num2;
if(args.length<2)
{
System.out.println("no command line argument");
return;
}
num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
System.out.println("prime nimbers between"+num1+"add"+num2+"are:");
for(i=num1;<num2;i++)
{
for(j=2;j<i;j++)
{
int n-i%j;
if(n==0)
{
break;
}
}
if(i==j)
{
System.out.println(+i);
}
}
}