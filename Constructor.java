class Box
{
doublelength,breadth,height;
Box()
{
length=6.2;
breadth=5.6;
height=2.7;
}
void volume()
{
System.out.print(length*breadth*height);
}
}
class Constructor
{
public static void main(String args[])
{
Box b=new Box();
b.volume();
}
}
