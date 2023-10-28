import java.util.Scanner;
class Demo36
{
public static void main(String[] args)
{
int a,i,sum=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter no. :");
a= sc.nextInt();

for(i=1;i<=a/2;i=i+1)
{
if(a%i==0)
{
sum=sum+i;
System.out.println(i);
}
}
System.out.println("sum :"+sum);
if (sum==a)
{
System.out.println("PERFECT");
}
else
{
System.out.println("IMPERFECT");
}
}
}

//print the divisors of a and their sum and tell the no. is perfect or not