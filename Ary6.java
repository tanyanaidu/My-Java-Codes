import java.util.Scanner;
class Ary6{
    public static void main(String[] args){
        int i,j,k,c=0;
        int [] x= new int[5];
        Scanner sc = new Scanner(System.in);
        for (i =0 ; i<x.length ; i++){
            System.out.println("Enter element of array ");
            x[i] = sc.nextInt();
        }
        for(i=0; i<5; i++){
            for(k=1; k<=(x[i]/2); k++){
                if(x[i]%k==0){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.println(x[i]+" is prime");
            }
            c=0;
        }
    }
}



//printing prime numbers from the array

