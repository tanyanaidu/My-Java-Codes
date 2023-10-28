import java.util.Arrays;
class Cmdtry4{
    public static void main(String[] args){
        int [] a = new int[args.length];
        for(int i=0;i<args.length;i++){
            a[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(a);
        System.out.println("Sorted array");
        for(int i=0;i<args.length;i++){
            System.out.println(a[i]);
        }
    }
}


//sorting an array through cmd