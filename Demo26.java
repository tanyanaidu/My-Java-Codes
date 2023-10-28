import java.util.Scanner;
class Demo26{
public static void main(String[] args){
int i,a,max=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number :");
a= sc.nextInt();
System.out.println("Enter "+a+" numbers :");
for (i=1;i<=a;i=i+1){
int b =sc.nextInt();
if (b>max){
max=b;
}
}
System.out.println("max no. :"+max);
}
}

//input a numbers and print the greatest among them

