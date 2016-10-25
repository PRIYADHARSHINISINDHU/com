import java.io.*;
import java.util.*;
class comp
{
public static void main(String[] args)
{
String s1,s2;
Scanner s=new Scanner(System.in);
System.out.print("s1:");
s1=s.nextLine();
System.out.print("s2:");
s2=s.nextLine();
if(s1.equals(s2))
{
System.out.println("Both are equal");
}
else
{
System.out.println("Both are not equal");
}
}
}
