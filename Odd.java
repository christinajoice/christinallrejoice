import java.io.*;
import java.util.*;
class Odd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number intervals");
int a=s.nextInt();
int b=s.nextInt();
for(int i=a;i<=b;i++)
{
if(i%2!=0)
{
System.out.print(i+"  ");
}
}
}
}
