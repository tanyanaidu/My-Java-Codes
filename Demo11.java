class Demo11
{
public static void main(String[] args)
{
int a=240,c;

if (a>=1 && a<=100)
{
System.out.println(" bill=200rs ");
}

if (a>=100 && a<=200)
{
c=200+(a-100)*2;
System.out.println(c);
}

if (a>=200 && a<=300)
{
c=200+(a-200)*3;
System.out.println(c);
}

if (a>=300 && a<=400)
{
c=200+(a-300)*4;
System.out.println(c);
}

if (a>=400)
{
c=200+(a-400)*5;
System.out.println(c);
}

}
}