import java.util.Scanner;

public class vowelscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter A word");
        String original = sc.nextLine().toLowerCase();
        int vowelscount=0;
        for(int i=0; i < original.length(); i++){
            char ch = original.charAt(i); 
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelscount++;
            }
        }
        System.out.println("Number of vowels: " + vowelscount);
        sc.close(); 
    }
}
