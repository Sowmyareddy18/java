importjava.util.*;
class Fibonacci
{
public static void main(String args[])
{
intN,a=0,b=1,c,sum=0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
c=a+b;
while(c<=N)
{
a=b;
b=c;
c=a+b;
if(c%2==0)
sum=sum+c;
}
System.out.print("sum="+sum);
}
}
