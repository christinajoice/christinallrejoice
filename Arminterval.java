import java.io.*;
import java.util.*;
class Arminterval
{
public static void main(String args[])
{
int temp,count=0,rem,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the interval");
int num1=s.nextInt();
int num2=s.nextInt();
for(int i=num1+1;i<=num2;i++)
{
temp=i;
n=0;
while(temp!=0)
{
rem=temp%10;
n=n+rem*rem*rem;
temp=temp/10;
}
if(i==n)
{
if(count==0)
{
System.out.println("Armstrong numbers are"+i);
}
count++;
}
}
if(count==0)
{
System.out.println("no armstrong numbers");
}
}
}
