class Demo34
{
public static void main(String[] args)
{
int i;
double d,sum=0;
for(i=1;i<=5;i=i+1)
{
d=Math.pow(i,i+1);
sum=sum+d;
System.out.println(d);
}
System.out.println("SUM :"+sum);
}
}

//1^2+2^3+3^4+4^5+5^6