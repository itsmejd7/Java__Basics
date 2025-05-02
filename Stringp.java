    import java.util.Scanner;
    public class Stringp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to reverse");
            String original=sc.nextLine();
            
            String reversed = new StringBuilder(original).reverse().toString();

            System.out.println("Original string: " + original);
            System.out.println("Reversed string: " + reversed);
        }
    }