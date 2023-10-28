class Demo2
{
public static void main(String[] args)
{

int a=72345,b,c,d,e,f,sum;

b=a%10;
System.out.println(b);

a=a/10;
c=a%10;
System.out.println(c);

a=a/10;
d=a%10;
System.out.println(d);

a=a/10;
e=a%10;
System.out.println(e);

a=a/10;
f=a%10;
System.out.println(f);

sum=b+d+c+e+f;
System.out.println(sum);

}
}