import java.util.Scanner;
class Ary5{
    public static void main(String[] args){
        int i,j,s=0,b=0;
        int [] x= new int[5];
        Scanner sc = new Scanner(System.in);
        for (i =0 ; i<x.length ; i=i+1){
            System.out.println("Enter element of array ");
            x[i] = sc.nextInt();
        }
        for(j=0;j<5;j++){
            while(x[j]!=0){
                b=x[j]%10;
                x[j]=x[j]/10;
            }
            s=s+b;
        }
        System.out.println(s);
    }
}

//extracting first number from elments of array and printing their sum

