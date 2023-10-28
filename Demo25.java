import java.util.Scanner;
class Demo25{
public static void main(String[] args){
int i,a,s=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number :");
a= sc.nextInt();
System.out.println("Enter "+a+" numbers :");
for (i=1;i<=a;i=i+1){
int b =sc.nextInt();
s=s+b;
}
System.out.println("sum of "+a+" entered numbers :"+s);

}
}

//program to input a numbers and print their sum
