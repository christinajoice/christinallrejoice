import java.io.*;
import java.util.*;
class Prime
{
public static void main(String args[])
{
int i,m=0,flag=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
m=n/2;
if(n==0||n==1)
{
System.out.println("Not a prime number");
}
else
{
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println(" not a prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("prime number");
}
}
}
}
