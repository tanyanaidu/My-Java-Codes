import java.util.Scanner;
class Demo15
{
public static void main(String[] args)
{
float e,f;
Scanner sc =new Scanner(System.in);
System.out.println("Enter marks");
float a= sc.nextFloat();
float b= sc.nextFloat();
float c= sc.nextFloat();

e=a+b+c;
f=e*100/300;

if (f>=75 && f<=100)
{
System.out.println("GRADE A");
}

if (f>=60 && f<=74)
{
System.out.println("GRADE B");
}

if (f>=40 && f<=59)
{
System.out.println("GRADE C");
}

if (f<=39)
{
System.out.println("FAIL");
}

}
}
