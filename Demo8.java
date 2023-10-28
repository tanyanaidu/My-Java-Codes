class Demo8
{
public static void main(String[] args)
{
float m1=37.5f,m2=38.3f,m3=39.4f,e,f;
e=m1+m2+m3;
f=e*100/300;

if (f>=75 && f<=100)
{
System.out.println("A");
}

if (f>=60 && f<=74)
{
System.out.println("B");
}

if (f>=40 && f<=59)
{
System.out.println("C");
}

if (f<=39)
{
System.out.println("FAIL");
}

}
}
