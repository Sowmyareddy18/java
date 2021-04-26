class Sum
{
void add(inta,int b)
{
System.out.println(a+b);
}
void add(float a,float b)
{
System.out.println(a+b);
}
void add(double a,double b)
{
System.out.println(a+b);
}
void add(inta,double b)
{
System.out.println(a+b);
}
}
class Method_overloading
{
public static void main(String args[])
{
Sum s=new Sum();
s.add(2,5);
s.add(4.6f,5.7f);
s.add(6.9,4.8);
s.add(2,5.9);
}
}
