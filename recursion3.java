public class recursion3{
    public static void f(int i, int n){
           if(i>n){
            return;
           }
           System.out.println(n);
           f(i,n-1);
    }
    public static void main (String[]arggs){
        
           f(1,23);
    }
}