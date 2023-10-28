import java.util.Scanner;
class Demo27{
public static void main(String[] args){
int i,a,p=0,c=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number :");
a= sc.nextInt();
System.out.println("Enter "+a+" numbers :");

for (i=1;i<=a;i=i+1){
int b =sc.nextInt();
if (b<p){
c=c+1;
}
p=b;
}

if (c==0){
System.out.println("YES");
}
else{
System.out.println("NO");
}

}
}


//program to input a numbers and check whether they are inserted in ascending order or not
