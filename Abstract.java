abstract class Shapes
{
abstract void ofTriangle(intb,int h);
abstract void ofRectangle(intl,int b);
abstract void ofCircle(int r);
abstract void ofSquare(int s);
}
class Area extends Shapes
{
voidofTriangle(intb,int h)
{
System.out.println("Area of Triangle:"+((b*h)/2));
}
voidofRectangle(intl,int b)
{
System.out.println("Area of Rectangle:"+(l*b));
}
voidofCircle(int r)
{
System.out.println("Area of Circle:"+(3.14*r*r));
}
voidofSquare(int s)
{
System.out.println("Area of Square:"+(s*s));
}
}
class Abstract
{
public static void main(String args[])
{
Area a=new Area();
a.ofTriangle(2,4);
a.ofRectangle(3,6);
a.ofCircle(5);
a.ofSquare(6);
}
}
