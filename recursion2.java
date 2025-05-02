public class recursion2{
    public static void f(int i, int n){
           if(i>n){
            return;
           }
           System.out.println(i);
           f(i+1,n);
    }
    public static void main (String[]arggs){
        
           f(1,3);
    }
}