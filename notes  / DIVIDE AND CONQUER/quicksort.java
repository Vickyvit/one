// THE FINAL CODE IS THIS
public class quicksort {
    //its very important to earn money to atleast sustain in this world
    // CAUSE everyone has harmones which can exite anybody but noteveryone has brain to control it and 
    // do the needful that can enhance his skills and move forward in carrier
   
    //function to print the actual array
    
    public static void printarr(int arr[]){
        for(int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
      
        //Recursive function to get the pivot and divide it wrt pivot
    public static void quicksortt(int arr[], int si, int ei ){
        if(si >=ei) {
            return;
        }
        int pivotidx = partition(arr, si, ei); //pivot founded now partion happens
        quicksortt(arr, si, pivotidx - 1); // left part
        quicksortt(arr, pivotidx + 1, ei); //right part
    }
   
    //we've divided left and right wrt pivot and 
    // this function compares the elements of the left and right to pivot

    public static int partition(int[] arr, int si, int ei) {
      int pivot = arr[ei];
      int i = si-1; // i is the actual index of the arrray 
        
    // j has been taken because we've to asssign i =-1 and 
    // with help of j we swap the numbers wrt pivot


      for(int j = si ; j< ei ; j++ ){
        if( arr[j] <= pivot){ //elements smaller than pivot
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











































/*public class quicksort {

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

*/
    public static void main(String args[]){
        int arr[] ={8,6,7,2,0,1};
        quicksortt(arr, 0, arr.length-1);
        printarr(arr);
    }
 }
