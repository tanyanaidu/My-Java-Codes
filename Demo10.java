class Demo10
{
public static void main(String[] args)
{
int a=15;


if (a%3==0 && a%5==0)
{
System.out.println("a is divisible by 3 and 5");
}

if (a%3==0 && a%5!=0)
{
System.out.println("a is divisible by 3 but not by 5");
}

if (a%3!=0 && a%5==0)
{
System.out.println("a is divisible by 5 but not by 3");
}

if (a%3!=0 && a%5!=0)
{
System.out.println("a is not divisible by 3 and 5");
}
}
}