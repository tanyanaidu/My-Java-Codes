import java.util.Scanner;
class Demo20
{
public static void main(String[] args)
{

int c;
Scanner sc= new Scanner(System.in);
System.out.println( "enter two no");
int a= sc.nextInt();
int b= sc.nextInt();

System.out.println(" enter your choice");
int cn = sc.nextInt();

switch (cn)
{
case 1:
c=a+b;
System.out.println(c);

case 2:
c=a-b;
System.out.println(c);

case 3:
c=a*b;
System.out.println(c);

case 4:
c=a/b;
System.out.println(c);

default:
System.out.println("invalid");
}

}
}



