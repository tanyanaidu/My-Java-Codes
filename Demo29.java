class Demo29
{
public static void main(String[] args)
{
int i;
double d,sum=0;
for(i=5;i>=1;i=i-1)
{
d=Math.pow(5,i);
System.out.println(d);
}


//5^5 5^4 5^3 5^2 5^1

for(i=1;i<=5;i=i+1){
d=Math.pow(5,i);
sum=sum+d;
System.out.println(d);
}
System.out.println("sum :"+sum);

//5^1 5^2 5^3 5^4 5^5 and their sum
}
}
