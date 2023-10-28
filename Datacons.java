class Datacons {
    Datacons(){
        System.out.println("Default Constructor");
    }
    Datacons(int a){
        System.out.println("1 Integer");
    }
    Datacons(int a, int b){
        System.out.println("2 Integer");
    }
    Datacons(float a){
        System.out.println("1 Float");
    }
    public static void main(String [] args){
        new Datacons();
        new Datacons(10);
        new Datacons(11,12);
        new Datacons(9.14f);
    }
    
}
