class Demo6
{
public static void main(String[] args)
{
int m=2470,a,b,c,d,e,f,g;

a=2470/500;
System.out.println("500 rs notes "+a);

m=m%500;
b=m/200;
System.out.println("200 rs notes "+b);

m=m%200;
c=m/100;
System.out.println("100 rs notes "+c);

m=m%100;
d=m/50;
System.out.println("50 rs notes "+d);

m=m%50;
e=m/20;
System.out.println("20 rs notes "+e);

m=m%20;
f=m/10;
System.out.println("10 rs notes "+f);

g=a+b+c+d+e+f;
System.out.println("total notes "+g);

}
}






