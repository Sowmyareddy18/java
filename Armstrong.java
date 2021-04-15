importjava.util.*;
class Armstrong
{
public static void main(String args[])
{
inta,x,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
a=sc.nextInt();
x=a;
while(a!=0)
{
n=a%10;
a=a/10;
sum=sum+n*n*n;
}
if(x==sum)
System.out.print("the number is Armstrong");
else
System.out.print("the number is not Armstrong");
}
}
