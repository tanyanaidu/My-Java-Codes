import java.util.Scanner;
class Demo32 {
public static void main(String[] args){
int a,b,i,s=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter two no. :");
a= sc.nextInt();
b= sc.nextInt();
for(i=a;i<= b;i=i+1){
if(i%3==0 || i%5==0){
s=s+i;
System.out.println(i);
}
}
System.out.println(s);
}
}

//to check numbers between a and b are divisors of 3 and 5 and print their sum
