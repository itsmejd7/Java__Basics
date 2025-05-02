public class reversearrayrec{
    public static void f(int []arr,int start, int end){
           if(start>=end){
            return;
           }
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;

           f(arr,start+1,end-1);
    }
    public static void main (String[]arggs){
        int []arr={30,40,54,59};

        f(arr,0,arr.length-1);

       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    
}
}
}