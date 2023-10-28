import java.util.Scanner;
class Ary1{
public static void main(String[] args){
int sum=0,sum2=0;
int [] x= new int[5];
Scanner sc = new Scanner(System.in);
for (int i =0 ; i<x.length ; i=i+1){
System.out.println("Enter element of array ");
x[i] = sc.nextInt();
}
for(int i=0 ; i<x.length; i++){
if (x[i]%2==0){
sum=sum+x[i];
}
else{
sum2=sum2+x[i];
}
}
System.out.println("Sum of even elements of arrays "+sum);
System.out.println("Sum of odd elements of arrays "+sum2);
}
}

//sum of even and odd numbers in an array