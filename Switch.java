import java.util.Scanner;
public class Switch{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Grade");
       String grade = sc.nextLine().toUpperCase();
        
        switch(grade){
            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("good");
                break;

            case "c":
                System.out.println("poor");
                break;


        }
    }

}