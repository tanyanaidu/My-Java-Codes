import java.util.Scanner;
class Math{
static int a,b,c;
static void add(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers ");
a= sc.nextInt();
b= sc.nextInt();
c= a+b;
System.out.println("Addition "+c);
}

public static void main(String[] args){
add();
}
}
