import java.io.*;
import java.util.*;
class Power
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base value and power value");
int base=s.nextInt();
int pow=s.nextInt();
int result=1;
for(int i=1;i<=pow;i++)
{
result=result*base;
}
System.out.println("The value is"+result);
}
}
