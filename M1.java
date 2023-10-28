import java.util.Scanner;
class Employee{
private int id;
private String name;
private float salary;

public void set(int i, String n, float s){
id=i;
name=n;
salary=s;
}
public int getid(){
return id;
}
public String getname(){
return name;
}
public float getsalary(){
return salary;
}
}

class M1{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

Employee e1 = new Employee();
System.out.println("Enter id, Name and salary of employee 1 ");
e1.set (sc.nextInt(), sc.next(), sc.nextFloat());

Employee e2 = new Employee();
System.out.println("Enter id, Name and salary of employee 2 ");
e2.set (sc.nextInt(), sc.next(), sc.nextFloat());

if (e1.getsalary()> e2.getsalary()){
System.out.println("Greater salary "+e1.getname());
}
else{
System.out.println("Greater salary "+e2.getname());
}
}
}