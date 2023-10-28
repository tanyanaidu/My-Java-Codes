import java.util.Scanner;
class Demo24
{
public static void main(String[] args)
{
int a,i,j,sum=0;
boolean x=false;
Scanner sc =new Scanner(System.in);
System.out.println("Enter no. :");
a= sc.nextInt();

for(i=1;i<=a/2;i=i+1){
if(a%i==0){
sum=sum+1;
System.out.println(i);
}
}
System.out.println("no. of divisors of "+a+" :"+sum);

if (sum!=1)
{
System.out.println(a+" is not prime number");
}
else
{
System.out.println(a+" is prime number ");
}

}
}

//print the numbers of divisors of a and a is prime or not