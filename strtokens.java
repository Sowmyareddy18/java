importjava.util.StringTokenizer;
public class Strtokens
{
public static void main(String args[])
{
int count=0;
String msg="Example of String Tokenizers";
StringTokenizerst=new StringTokenizer(msg,"");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
count++;
}
System.out.print(count);
}
