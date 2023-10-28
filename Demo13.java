class Demo13
{
public static void main(String[]args)
{
int a=12345,b,c,d;

if (a>=10000 && a<=99999)
{
b=a%10;
c=(a/100)%10;
d=a/10000;
System.out.println(b+c+d);
}
else
{
System.out.println("INVALID");
}

}
}