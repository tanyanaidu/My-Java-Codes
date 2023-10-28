import java.util.Scanner;
class Demo21
{
public static void main(String[] args)
{
int a,b,c,sum;

System.out.println(" 1 for even odd ");
System.out.println(" 2 for addition of two no.");
System.out.println(" 3 for greater among three no.");
Scanner sc= new Scanner(System.in);
System.out.println( "ENTER CHOICE");
int ch= sc.nextInt();

switch (ch)
{
case 1:
System.out.println("ENTER NUMBER");
a= sc.nextInt();
if (a%2==0)
{
System.out.println(a+"is even");
}
else
{
System.out.println(a+"is odd");
}
break;


case 2:
System.out.println("ENTER TWO NUMBER");
a= sc.nextInt();
b= sc.nextInt();
sum=a+b;
System.out.println("addition is :" +sum);
break;


case 3:
System.out.println("ENTER THREE NUMBER");
a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();
if (a>b && a>c)
{
System.out.println(a+ " is greater");
}

if (b>a && b>c)
{
System.out.println(b+ " is greater");
}

if (c>b && c>a)
{
System.out.println(c+ " is greater");
}
break;
}


}
}