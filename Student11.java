import java.util.Scanner;
class Stud {
    private int rno;
    private String name;
    private float marks;
    Stud(){
        rno=1;
        name=" tanya ";
        marks=70.5f;
    }
    Stud(int i, String n,float m){
        rno=i;
        name=n;
        marks=m;
    }
    public int getrno(){
        return rno;
    }
    public String getname(){
        return name;
    }
    public float getmarks(){
        return marks;
    }

}
class Student11{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //System.out.println("Enter Details of Student 1");
    Stud s1 = new Stud();

    System.out.println("Enter Details of Student 2");
    Stud s2 = new Stud(sc.nextInt(), sc.next(), sc.nextFloat());

        if (s1.getmarks()> s2.getmarks()){
             System.out.println(" Student 1 "+s1.getname());
        }
        else{
            System.out.println(" Student 2 "+s2.getname());
        }
    }

}
