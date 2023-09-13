//Same hi cheez hai Recursion/ Divide and Conquer pdha n 
//

public class backtrack_Arrays{  
        public static void backtrack(int arr[], int i, int val){
            //base case
            if( i == arr.length){
                printarr(arr); //while going from bottom to top of the Call Stack Print The array
                return;
            }
            //recursion
            arr[i] = val; /
            backtrack(arr, i + 1, val + 1);
            arr[i]= arr[i] - 2;
        }
        public static void printarr(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+ "  ");
            }
            System.out.println();
        }

    public static void main (String args[]){
        int arr[] = new int[5];
       // printarr(arr);
        backtrack(arr,0, 1);
        printarr(arr);
    }
}
