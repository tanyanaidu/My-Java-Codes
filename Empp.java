class Empp {
    private int id;
    private String name;
    private String dept;
    private float salary;
    private long contact;
    Empp(){
        id=0;
        name="abc ";
        dept="abc ";
        salary=0.0f;
        contact=0000000000;
    }
    Empp(int i, String n, String d, float s, long c){
        id=i;
        name=n;
        dept=d;
        salary=s;
        contact=c;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getdept(){
        return dept;
    }
    public float getsalary(){
        return salary;
    }
    public long getcontact(){
        return contact;
    }

    public static void main(String [] args){
        Empp s1 = new Empp();
        Empp s2 = new Empp(1, "SIMMY" , " CSE " , 5000f , 9755424949l);
        System.out.println(" Employee 1 ");
        System.out.println(s1.getid());
        System.out.println(s1.getname());
        System.out.println(s1.getdept());
        System.out.println(s1.getsalary());
        System.out.println(s1.getcontact());

        System.out.println(" Employee 2 ");
        System.out.println(s2.getid());
        System.out.println(s2.getname());
        System.out.println(s2.getdept()); 
        System.out.println(s2.getsalary());
        System.out.println(s2.getcontact());
    }
    
}
