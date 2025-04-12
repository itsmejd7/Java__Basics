import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        int n=4;
        for(int i=0; i<=n; i++){

            for(int j=n-i+1; j>=1; j--){

                System.out.print(" ");

                for(int k=0; k<=i ; k++){
                    
                    System.out.print("* ");
                    
                }
                System.out.println();
            }
        }
    }
}