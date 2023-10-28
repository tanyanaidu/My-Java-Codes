class Demo28 
{
public static void main(String[] args)
{
int i;
double d,sum=0;
for(i=1;i<=5;i=i+1)
{
if (i%2!=0)
{
d=Math.pow(5,i);
sum=sum+d;
System.out.println(d);
}
}
System.out.println("SUM :"+sum);
}
}

//5^1+5^3+5^5+5^7+5^9