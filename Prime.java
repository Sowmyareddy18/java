class Prime
{
public static void main(String args[])
{
inti,j;
for(i=1;i<=100;i++)
{
int factor=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
factor++;
}
if(factor==2)
System.out.print(i+"");
}
}
}
