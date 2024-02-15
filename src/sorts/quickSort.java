/*
 * Quick Sort:it has pivot and partion 
 * pivot means we select one element in array 
 * make partition (making into 2 parts ) pivot will check less than number and arrange it in left. 
 * pivot check for greater number and arrange it in right iterator will initialized with "-1"
 * 
 */

public class quickSort {

    public static void quickSort(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int pivot=partion(arr,start,end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    public static int partion(int[] arr, int si, int ei) {
        int pivotEle = arr[ei]; // last element
        int i = si - 1; // to keep track of elements less than or equal to the pivot
    
        for (int j = si; j < ei; j++) {
            if (arr[j] >= pivotEle) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    
        // Swap arr[i+1] and arr[ei] (pivot element)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
    
        // Return the pivot index
        return i + 1;
    }
    
    public static void main(String[] args) {
        int []arr={8,5,7,9,6,3,2,4,8,1};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i + " ");  
        }
    }
}
    
