class Conss{
static int c;
Conss(){
c++;
}
static void display(){
System.out.println(c);
}

public static void main(String[] args){
Conss d1 = new Conss();
Conss d2 = new Conss();
Conss d3 = new Conss();
Conss d4 = new Conss();
display();
}
}