public class sumofn{
    public static void f(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);
           
    }
    public static void main (String[]arggs){
        
           f(1000,0);
    }
}