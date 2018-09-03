import java.io.*;
import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int a=s.nextInt();
int fact=1;
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("The factorial is"+fact);
}
}
