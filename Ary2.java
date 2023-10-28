import java.util.Scanner;
class Ary2{
    public static void main(String[] args){
        int m,n,i;
        int [] x= new int[5];
        Scanner sc = new Scanner(System.in);
        for (i =0 ; i<x.length ; i=i+1){
            System.out.println("Enter element of array ");
            x[i] = sc.nextInt();
        }
        m=x[0];
        n=x[0];
        for(i=0;i<5;i++){
            if(m<x[i]){
                m=x[i];
            }
            else{
                n=x[i];
            }
        }
        System.out.println("maximum value "+m);
        System.out.println("minimun value "+n);
    }
}

//print maximum and minimum value in array