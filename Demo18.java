import java.util.Scanner;
class Demo18
{
public static void main(String[] arg)
{
int w,x,y,z,sum;
Scanner sc = new Scanner(System.in);
System.out.println("enter no");
int a = sc.nextInt();

if (a>=1000&&a<=9999)
{
x=a%10;
y=(a/10)%10;
w=(a/100)%10;
z=a/1000;
sum=x+y+z+w;
if(sum%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}

else
{
System.out.println("invalid");
}

}
}