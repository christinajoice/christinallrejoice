import java.io.*;
import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int a,c=0,temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
{
System.out.println("armstrong number");
}
else
{
System.out.println("Not an armstrong number");
}
}
}
