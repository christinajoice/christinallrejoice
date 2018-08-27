import java.io.*;
import java.util.*;
class Primeinterval
{
public static void main(string args[])
{
int i,m=0,flag=0;
Scanner s=new Scanner(system.in);
System.out.println("Enter the number interval");
int a=s.nextInt();
int b=s.nextInt();
for(i=a;i<=b;i++)
{
int m=i/2;
if(i==0||i==1)
{
System.out.println("not aprime number");
}
else
{
for(int j=2;j<=m;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(i);
}
}
}
}
