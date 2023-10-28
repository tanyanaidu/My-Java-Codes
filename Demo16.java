import java.util.Scanner;
class Demo16
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter no.");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();

if(a>b && a>c)
{
if(b>c)
{
System.out.println(b+" is second greatest");
}
else
{
System.out.println(c+" is second greatest");
}
}

if(b>a && b>c)
{
if(a>c)
{
System.out.println(a+" is second greatest");
}
else
{
System.out.println(c+" is second greatest");
}
}

if(c>a && c>b)
{
if(b>a)
{
System.out.println(b+" is second greatest");
}
else
{
System.out.println(a+" is second greatest");
}
}

}
}