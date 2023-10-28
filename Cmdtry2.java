class Cmdtry2{
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        int i,f=1;
        for( i =a ; i>=1 ; i=i-1 ){
            f=f*i;
        }
        System.out.println(f);
    }
}

//factorial of inserted number in cmd