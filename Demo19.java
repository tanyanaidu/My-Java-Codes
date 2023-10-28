import java.util.Scanner;
class Demo19
{
public static void main(String[] args)
{
int ar;
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b =sc.nextInt();
int c= sc.nextInt();

if (a==b && b==c)
{
System.out.println("Equilateral Triangle");
}

else if (a==b||b==c||c==a)
{
System.out.println("Iso Triangle ");
}

else
{
System.out.println("scalene Triangle");
}

}
}

