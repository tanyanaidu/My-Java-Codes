class Student{
private int rollno;
private String name;
private float marks;
public void set(int r, String n, float m){
rollno =r;
name= n;
marks =m;
}
public int getrollno(){
return rollno;
}
public String getname(){
return name;
}
public float getmark(){
return marks;
}
}

class M{
public static void main(String[] args){
Student s = new Student();
s.set(101, " A ",40.8f);
System.out.println("Rollno "+ s.getrollno());
System.out.println("Name "+ s.getname());
System.out.println("Mark "+ s.getmark());
}
}