class Cmdtry1{
public static void main(String [] args){
int i,s= 0;
for( i =0; i< args.length; i++){
s= s + Integer.parseInt( args[i] );
}
System.out.println( s );
}
}

//sum of all inserted elements through cmd