importjava.util.*;
class Binarysearch
{
public static void main(String args[])
{
intn,l,h,mid;
int a[]=new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of element");
n=sc.nextInt();
System.out.println("enter the elements");
for(inti=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element to search");
int key=sc.nextInt();
l=0;
h=n-1;
mid=(l+h)/2;
while(l<=h)
{
if(key==a[mid])
{
System.out.println(" element is found at"+mid);
break;
}
if(key<a[mid])
{
h=mid-1;
}
else
{
l=mid+1;
}
mid=(l+h)/2;
}
if(l>h)
System.out.print("element not found");
}
}
