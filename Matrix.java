importjava.util.*;
class Matrix
{
public static void main(String args[])
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
int cm[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements");
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=sc.nextInt();
}
}
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Matrix Addition");
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(c[i][j]);
System.out.print("");
}
System.out.println();
}
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<2;k++)
{
cm[i][j]=cm[i][j]+a[i][k]*b[k][j];
}
}
}
System.out.println("Matrix Multiplcation");
for(inti=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(cm[i][j]);
System.out.print("");
}
System.out.println();
}
}
}
