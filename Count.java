import java.io.*;
import java.util.*;
class Count
{
public static void main(String args[])
{
int i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int a=s.nextInt();
while(a!=0)
{
a=a/10;
i++;
}
System.out.println(i);
}
}
