importjava.lang.StringBuffer;
importjava.lang.String;
class String
{
public static void main(String args[])
 {
StringBuffer s1=new StringBuffer("ADITYA");
StringBuffer s2=new StringBuffer("COLLEGE");
System.out.println("before deletion s1:"+s1);
System.out.println("After deletion:");
System.out.println(s1.deleteCharAt(3));
System.out.println("before deletion s2:"+s2);
System.out.println("after deletion:");
System.out.println(s2.deleteCharAt(4));
}
}
