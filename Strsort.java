importjava.util.*;
class Strsort
{
public static void main(String args[])
{
inti,n,j;
String temp;
Scanner sc=new Scanner(System.in);
String names[]=new String[20];
System.out.println("enter size");
n=sc.nextInt();
System.out.println("enter names:");
for(i=0;i<n;i++)
{
names[i]=sc.next();
}
System.out.println("\nSorting words/names in Alphabetical order..\n");
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
   {
if(names[j].compareTo(names[j+1])>0)
     {
temp=names[j];
names[j]=names[j+1];
names[j+1]=temp;
     }
   }
}
System.out.println("words/names sorted in alphabetical order");
for(i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}
