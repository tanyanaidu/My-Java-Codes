import java.util.Scanner;
class Sexyprime{
private static int num;
public void set(int n){
num=n;
}
public int getnum(){
return num;
}

public static void main(String args[]){
int count=0,x;
Scanner sc = new Scanner(System.in);
Sexyprime s= new Sexyprime();
System.out.println("Enter prime number ");
s.set(sc.nextInt());
x= s.getnum()+6;
System.out.println(x);

for (int i=2;i<=x/2;i=i+6){
if (x%i==0){
count=count+1;
}
}
if (count==0){
System.out.println(s.getnum()+" and "+x+" is Sexy prime ");
}
else{
System.out.println(s.getnum()+" and "+x+" is not Sexy prime ");
}
}
}