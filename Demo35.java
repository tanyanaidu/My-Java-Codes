import java.util.Scanner;
class Demo35
{
public static void main(String[] args)
{
int i,x,y;
double a,b,c,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers :");
x= sc.nextInt();
y= sc.nextInt();

for(i=1;i<=5;i=i+1)
{
a=Math.pow(x,i);
b=Math.pow(y,i-1);
c=a/b;
sum=sum+c;
System.out.println(c);
}
System.out.println("SUM :"+sum);
}
}

//x^1/y^0+x^2/y^1+x^3/y^2+x^4/y^3+x^5/y^4