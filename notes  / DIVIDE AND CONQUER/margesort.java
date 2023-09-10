//to write the code for mergesort
// it works as arr is given and you have to sort it
// first divide it into 2 part the further divide it till you get single element
//  then keep those elements into a temp arr in which you will write 
// a fn to sort it then transfer it to the final arr as sorted

// TIME COMPLEXITY : O(nlogn)
// SPACE COMPLEXITY : O(n)

//code
public class margesort{
    public static void printarr(int arr[]){
        for(int i=0 ; i <= arr.length; i++ ){
            System.out.print(arr[i]+ "   ");
        }
        System.out.println();
    }
    //merge fn
    public static void merge( int arr[] , int si,int mid, int ei){
        int temp[] = new int[ei -si +1];
        int i =si ; //iterator for left
        int j = mid + 1;  //iterator for right
        int k = 0;  //iterator for temp arr

        while( i<=mid && j<= ei){
            if(arr[i] <arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] =arr[j];
                j++;
            }
            k++;
        }
         //for bachha hua part
        while(i <= mid){
            temp[k++] =arr[i++];
        }
        while(j <= ei){
            temp[k++] =arr[j++];
        }

        for( k=0, i=si; k< temp.length; k++, i++){
            arr[i] =temp [k];
        }

    }


    //merge sort fn
    public static void mergesort(int arr[], int si ,int ei ){
        if( si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid ); //left
        mergesort(arr, mid+1, ei);//right
        merge(arr, si, mid, ei);//merge
        
    }

    //main fn
    public static void main (String arg[]){
        int arr[] ={7,6,5,4,3,2,1,-5};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
}















