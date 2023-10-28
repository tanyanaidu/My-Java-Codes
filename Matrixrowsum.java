import java.util.Scanner;
class Matrixrowsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][]a= new int[3][3];
        int i ,j ,s=0;
        System.out.print("Enter no ");
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0 ; i< a.length; i++){
            for(j=0 ; j< a[i].length; j++){
                s= s+a[i][j];
            }
            System.out.print("Sum : "+s);
            System.out.println();
            s=0;
        }
    }
}
//sum of row in matrix