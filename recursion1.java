public class recursion1{
    public static void f(int i,int n){
            if(i>n){
                return;
            }
            System.out.println("Jayesh");
            f(i+1,n);
    }
    public static void main (String[]arggs){
        
            f(1,5);
    }
}