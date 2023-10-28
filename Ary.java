import java.util.Scanner;
class Ary{
public static void main(String[] args){
int sum=0;
int [] x= new int[5];
Scanner sc = new Scanner(System.in);
for (int i =0 ; i<x.length ; i=i+1){
System.out.println("Enter element of array ");
x[i] = sc.nextInt();
}
for(int i=0 ; i<x.length; i++){
sum=sum+x[i];
}
System.out.println("Sum of elements of arrays "+sum);
}
}

//sum of elemnts of arrays
