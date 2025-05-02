public class factorialrec{
    public static int  f(int n){
        if(n==0){
            return 1;
        }
        return n * f(n-1);
           
    }
    public static void main (String[]arggs){
           System.out.println(f(5));
    }
}