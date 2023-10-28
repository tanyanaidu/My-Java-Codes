import java.util.Scanner;
class Matrixsum{
    public static void main(String[] args){
        int [] [] a= new int [3] [3];
        int i ,j ,s=0;
        Scanner sc = new Scanner(System.in);
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                System.out.print("Enter no ");
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                s= s+a[i][j];
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum : "+s);
    }
}


//sum of all elements inside matrix