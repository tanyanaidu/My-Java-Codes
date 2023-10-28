import java.util.Scanner;
class Cmdmatrix1{
public static void main(String[]args)
{
int[][] a = new int[3][3];
int i,j,sum=0;
Scanner sc = new Scanner(System.in);
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print("enter number");
a[i][j]=sc.nextInt();
}
}
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++);
{
sum=sum+a[i][j];
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Sum="+sum);
}
}