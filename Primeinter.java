import java.io.*;
import java.util.*;
class Primeinter
{
public static void main(String args[])
{
int flag;
System.out.println("Enter the intervals");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
while(a<b)
{
flag=0;
for(int i=2;i<=a/2;++i)
{
if(a%i==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(a);
}
++a;
}
}
}
