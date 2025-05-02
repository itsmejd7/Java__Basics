import java.util.Scanner;
class selectionsort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        //outter loop

        for(int i=0; i<arr.length-1; i++){
            int smallest= i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        }
        
    }