importjava.util.*;
class Quadratic
{
public static void main(String args[])
{
doublea,b,c,d;
double root1,root2;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextDouble();
System.out.println("enter b value");
b=sc.nextDouble();
System.out.println("enter c value");
c=sc.nextDouble();
d=b*b-4*a*c;
if(d>0)
{
root1=(-b+Math.sqrt(d)/(2*a));
root2=(-b-Math.sqrt(d)/(2*a));
System.out.println("Root1="+root1+"Root2="+root2);
System.out.println("roots are real and distinct");
}
else if(d==0)
{
root1=root2=(-b)/(2*a);
System.out.println("Root1="+root1+"Root2="+root2);
System.out.println("roots are equal");
}
else
{
System.out.print("roots are imaginary");
}
}
}
