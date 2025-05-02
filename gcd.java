import java.util.*;
import java.util.Scanner;

public class gcd {
        

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int result=1;
        for(int i = 1 ; i< Math.min(n1,n2); i++ ){
                if( n1 % i == 0 && n2 % i == 0){
                     result = i;
                }
                
               
        }
        System.out.println("The Gcd is "+ result );
        
    }

        

        
    }

