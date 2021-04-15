importjava.util.*;
class Bikers
{
public static void main(String args[])
{
double b1,b2,b3,b4,b5,average;
Scanner sc=new Scanner(System.in);
System.out.println("enter first biker speed");
b1=sc.nextDouble();
System.out.println("enter second biker speed");
b2=sc.nextDouble();
System.out.println("enter third biker speed");
b3=sc.nextDouble();
System.out.println("enter fourth biker speed");
b4=sc.nextDouble();
System.out.println("enter fifth biker speed");
b5=sc.nextDouble();
average=(b1+b2+b3+b4+b5)/5;
if(b1>average)
System.out.println("first biker is Qualified with speed"+b1+"speed");
if(b2>average)
System.out.println("second biker is Qualified with speed"+b2+"speed");
if(b3>average)
System.out.println("third biker is Qualified with speed"+b3+"speed");
if(b4>average)
System.out.println("fourth biker is Qualified with speed"+b4+"speed");
if(b5>average)
System.out.println("fifth biker is Qualified with speed"+b5+"speed");
}
}
