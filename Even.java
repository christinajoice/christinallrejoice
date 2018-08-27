import java.io.*;
import java.util.*;
class Even
{
public static void main(String args[])
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number intervals");
int a=s.nextInt();
int b=s.nextInt();
for(i=a;i<=b;i++)
{
if(i%2==0)
{
System.out.print(i+"  ");
}
}
}
}
