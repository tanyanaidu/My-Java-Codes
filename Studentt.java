class Studentt {
    private int rno;
    private String name;
    private float marks;
    Studentt(){
        rno=0;
        name="abc ";
        marks=0.0f;
    }
    Studentt(int r, String n, float m){
        rno=r;
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
    public static void main(String [] args){
        Studentt s1 = new Studentt();
        Studentt s2 = new Studentt(101, "SIMMY" ,50.2f);
        System.out.println(" Student 1 ");
        System.out.println(s1.getrno());
        System.out.println(s1.getname());
        System.out.println(s1.getmarks());
        System.out.println(" Student 2 ");
        System.out.println(s2.getrno());
        System.out.println(s2.getname());
        System.out.println(s2.getmarks()); 
    }
}
