import java.util.Scanner;

public class hashing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string
        System.out.print("Enter a lowercase string: ");
        String str = sc.next();

        // Create hash array for 26 lowercase letters (a to z)
        int[] hash = new int[26];

        // Fill the hash array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash[ch - 'a']++;  // 'a' → 0, 'b' → 1, ..., 'z' → 25
        }

        // Read number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter characters to query:");
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println("Frequency of '" + c + "': " + hash[c - 'a']);
        }

        sc.close();
    }
}
