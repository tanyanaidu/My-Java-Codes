import java.util.Scanner;
class Diagnolsum{
    public static void main(String[] args){
        int [] [] a= new int [3] [3];
        int i ,j ,t=0,s=0;
        Scanner sc = new Scanner(System.in);
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                System.out.print("Enter no ");
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                if (i==j){
                    s= s+a[i][j];
                }
                if (i+j==2){
                    t= t+a[i][j];
                }
            }
        }
        System.out.print(t);
        System.out.println();
        System.out.print(s);
    }
}

//diagnol sum of matrix
