import java.util.Scanner;
class Student10{
private int rno;
private String name;
private float marks;
private static String clg;

public void set(int r, String n, float m){
rno=r;
name=n;
marks=m;
}
public static void set(String c){
clg=c;
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
public static String getclg(){
return clg;
}

public static void main(String[] args){
Scanner sc= new Scanner(System.in);

Student10 s1= new Student10();
System.out.println("Enter rollno, name, marks of student 1");
s1.set(sc.nextInt(), sc.next(), sc.nextFloat());


Student10 s2= new Student10();
System.out.println("Enter rollno, name, marks of student 2");
s2.set(sc.nextInt(), sc.next(), sc.nextFloat());

Student10 s3= new Student10();
System.out.println("Enter rollno, name, marks of student 3");
s3.set(sc.nextInt(), sc.next(), sc.nextFloat());

System.out.println("Enter college name ");
set(sc.next());

System.out.println("Student 1 details ");
System.out.println("Rollno "+s1.getrno());
System.out.println("Name "+s1.getname());
System.out.println("Marks "+s1.getmarks());
System.out.println("College "+getclg());

System.out.println("Student 2 details ");
System.out.println("Rollno "+s2.getrno());
System.out.println("Name "+s2.getname());
System.out.println("Marks "+s2.getmarks());
System.out.println("College "+getclg());

System.out.println("Student 3 details ");
System.out.println("Rollno "+s3.getrno());
System.out.println("Name "+s3.getname());
System.out.println("Marks "+s3.getmarks());
System.out.println("College "+getclg());

}
}
