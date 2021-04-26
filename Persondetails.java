importjava.util.*;
class Person
{
String name;
String gender;
int age;
String highqu;
int salary;
String  exp;
void personal()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.next();
System.out.println("enter gender");
gender=sc.next();
System.out.println("enter age");
age=sc.nextInt();
}
void qualification()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter highestqualification");
highqu=sc.next();
System.out.println("enter salary");
salary=sc.nextInt();
System.out.println("enter experience");
exp=sc.next();
}
void display()
{
System.out.println("NAME ="+name);
System.out.println("GENDER="+gender);
System.out.println("AGE="+age);
System.out.println("HIGHEST QUALIFICATION="+highqu);
System.out.println("SALARY="+salary);
System.out.println("EXPERIENCE="+exp);
}
}
class Persondetails
{
public static void main(String args[])
{
Person p=new Person();
p.personal();
p.qualification();
p.display();
}
}
