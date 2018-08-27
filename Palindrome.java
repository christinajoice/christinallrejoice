import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int r,sum=0,temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int a=s.nextInt();
temp=a;
while(a>0)
{
r=a%10;
sum=(sum*10)+r;
a=a/10;
}
if(temp==sum)
System.out.println("Palindrome");
else
{
System.out.println("Not a Palindrome");
}
}
}
