import java.util.Scanner;
class Demo17
{
public static void main(String[] args)
{
int a,b,c,d,e,f;
Scanner sc =new Scanner(System.in);
System.out.println("Enter amount");
int m= sc.nextInt();


a=m/500;
if (a!=0)
{
System.out.println("500 rs notes "+a);
}

m=m%500;
b=m/200;
if (b!=0)
{
System.out.println("200 rs notes "+b);
}

m=m%200;
c=m/100;
if(c!=0)
{
System.out.println("100 rs notes "+c);
}

m=m%100;
d=m/50;
if(d!=0)
{
System.out.println("50 rs notes "+d);
}

m=m%50;
e=m/20;
{
if(e!=0)
System.out.println("20 rs notes "+e);
}

m=m%20;
f=m/10;
if(f!=0)
{
System.out.println("10 rs notes "+f);
}

}
}
