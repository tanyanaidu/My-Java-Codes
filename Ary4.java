import java.util.Scanner;
import java.util.Arrays;
class Ary4{
    public static void main(String[] args){
        int i;
        int [] x= new int[5];
        Scanner sc = new Scanner(System.in);
        for (i =0 ; i<x.length ; i=i+1){
            System.out.println("Enter element of array ");
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        System.out.println("SORTED ARRAY IN ASCENDING ORDER");
        for(i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

//Sorting a array