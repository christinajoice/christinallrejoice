import java.io.*;
import java.util.*;
class Leap
{
public static void main(String args[])
{
System.out.println("Enter a year");
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year/4==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("not a leap year");
}
}
}
