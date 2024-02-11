/*
    Insertion sort: Time complexity is 0(n²) .
 * it works similar to th e sorting of playing cards if we assume that 
 * first card is already sorted in the card game then we select unsortedcard
 * if wwe selected unsorted card is greater than the first card or previous card ,it will placed at the right side. 
 * otherwise it will be placed at the left side 
 * similarly all unwanted cards are taken and put in the exact places
 
 */

public class insertionSort {
    public static void insertionSorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        }
    public static void main(String[] args) {
        int []arr={8,5,7,9,6,3,2,4,8,1};
        insertionSorting(arr);
        for(int i:arr){
            System.out.print(i + " ");  
        }
    }
}
