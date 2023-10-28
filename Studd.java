import java.util.Scanner;
class Studd {
    private int rno;
    private String name;
    public void set(int i, String n){
        rno=i;
        name=n;
    }
    public int getrno(){
         return rno;
    }
    public String getname(){
         return name;
    }
}
class Marks extends Studd{
    private float m1,m2,m3;
    public void set(float x,float y,float z){
          m1=x;
          m2=y;
          m3=z;
    }
    public float getm1(){
          return m1;
    }
    public float getm2(){
          return m2;
    }
    public float getm3(){
          return m3;
    }
    public float gettotal(){
          return m1+m2+m3;
    }
    public static void main(String[] args){
          Marks m = new Marks();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter roll no. and name ");
          m.set(sc.nextInt(), sc.next());
          System.out.println("Enter marks of three subjects ");          
          m.set(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()); 
          System.out.println("Rollno "+m.getrno());   
          System.out.println("Name "+m.getname());     
          System.out.println("MArks of each subjects "+m.getm1() +" "+m.getm2()+" "+m.getm3());    
          System.out.println("Total marks "+m.gettotal());     
    }
}