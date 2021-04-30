importjava.lang.*;
importjava.util.*;
interface Internal
{
public void internalMarks();
}
interface External
{
public void externalMarks();
}
class M implements Internal,External
{
intintermarks[]=new int[5];
intextermarks[]=new int[5];
int sum[]=new int[5];
public void  internalMarks()
{
Scanner sc=new Scanner(System.in);
for(inti=0;i<5;i++)
{
intermarks[i]=sc.nextInt();
}
}
public void externalMarks()
{
Scanner sc=new Scanner(System.in);
for(inti=0;i<5;i++)
{
extermarks[i]=sc.nextInt();
}
}
voidtotalM()
{
for(inti=0;i<5;i++)
{
System.out.println(sum[i]=intermarks[i]+extermarks[i]);
}
}
}
class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of the student");
String name=sc.next();
System.out.println("enter Roll number of the student");
intrno=sc.nextInt();
M m=new M();
System.out.println("enter internal marks");
m.internalMarks();
System.out.println("enter external marks");
m.externalMarks();
System.out.println("The name of the student:"+name);
System.out.println("Roll numbers of the student:"+rno);
System.out.println("Total marks:");
m.totalM();
}
}
