import java.util.Scanner;
class Sexyprime1{
public static int check(int a){
int c=0,b=1;
for(int i=1;i<=a/2;i=i+1){
if(a%i==0){
c=c+1;
}
}
if (c==1){
b=25;
}
return b;
}
private static int num;
public void set(int n){
num=n;
}
public int getnum(){
return num;
}

public static void main(String args[]){
int x,y;
Scanner sc = new Scanner(System.in);
Sexyprime1 s= new Sexyprime1();
System.out.println("Enter number ");
s.set(sc.nextInt());
x= s.getnum()+6;

if (check(s.getnum())==25 && check(x)== 25){
System.out.println(s.getnum()+" and "+x+" is Sexy prime ");
}
else{
System.out.println(s.getnum()+" and "+x+" is not Sexy prime ");
}
}
}