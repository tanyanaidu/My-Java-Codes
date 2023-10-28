import java.util.Scanner;
class Demo30 {
public static void main(String[] args){
int a,b,i,s=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter no. :");
a= sc.nextInt();
b= sc.nextInt();
for(i=a;i<= b;i=i+1){
s=s+i;
}
System.out.println(s);
}
}

//to print sum of numbers between a and b