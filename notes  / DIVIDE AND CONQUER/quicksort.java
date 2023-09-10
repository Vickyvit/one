public class quicksort {

    public static void printarr(int arr[]){
        for(int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    public static void quicksortt(int arr[], int si, int ei ){
        if(si >=ei) {
            return;
        }

        int pivotidx = partition(arr, si, ei);
        quicksortt(arr, si, pivotidx - 1);
        quicksortt(arr, pivotidx + 1, ei);
    }
   

    public static int partition(int[] arr, int si, int ei) {
      int pivot = arr[ei];
      int i = si-1;

      for(int j = si ; j< ei ; j++ ){
        if( arr[j] <= pivot){
               i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
         
        }
      }
      //for elements > pivot
      i++;
      int temp =pivot;
      arr[ei] = arr[i];
      arr[i] = temp;
      return i;
    }


    public static void main(String args[]){
        int arr[] ={8,6,7,2,0,1};
        quicksortt(arr, 0, arr.length-1);
        printarr(arr);
    }
 }