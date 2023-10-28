class Cmdtry3{
public static void main(String [] args){
int max=0,i;
for( i =0; i< args.length; i++){
if (Integer.parseInt(args[i])>max){
max= Integer.parseInt(args[i]);
}
}
System.out.println( max );
}
}

//maximum number among all inserted elements through cmd