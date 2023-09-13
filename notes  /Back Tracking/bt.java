public class bt {
    
    public static void backtrack(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        backtrack(arr, i + 1, val + 1);
        // Backtrack by restoring the previous value
        arr[i] = arr[i] - 2;
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Change i<=arr.length to i<arr.length
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        backtrack(arr, 0, 1);
        printarr(arr);
    }
}

