import java.util.Scanner;                  // 1

public class hashing1 {                    // 2  – class name must match file name (Hashing1.java)
    public static void main(String[] args) {// 3  – program entry point
        Scanner sc = new Scanner(System.in);// 4  – read from stdin

        // --- read the array size ---
        System.out.print("Enter array size (n): ");
        int n = sc.nextInt();               // 5  – number of elements
        int[] arr = new int[n];             // 6  – allocate the array

        // --- read the elements and track the maximum value ---
        System.out.println("Enter " + n + " integers:");
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {       // 7
            arr[i] = sc.nextInt();          // 8
            if (arr[i] > maxVal)            //   track largest element
                maxVal = arr[i];
        }

        // --- build the frequency (“hash”) table dynamically ---
        int[] hash = new int[maxVal + 1];   // 9  – size = (max value + 1)
        for (int i = 0; i < n; i++) {       // 10
            hash[arr[i]]++;                 // 11
        }

        // --- read and answer queries ---
        System.out.print("Enter number of queries (q): ");
        int q = sc.nextInt();               // 12
        System.out.println("Now enter " + q + " query numbers:");
        while (q-- > 0) {                   // 13  – runs exactly q times
            int number = sc.nextInt();      // 14
            if (number >= 0 && number < hash.length) {
                System.out.println(hash[number]); // 15
            } else {
                System.out.println("Out of range: " + number);
            }
        }

        sc.close();                         // 16
    }                                       // 17
}                                           // 18
