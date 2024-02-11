/*
    Selection sort: Time complexity is 0(n²) .
 * find the smallest element in the array and place in the first position 
 * after the second smallest element in the array and place in the second position 
 * like that entire process will be sorted done
 */

public class selectionSort {
    public static void selectionSorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    int temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                }
            }
        }
        }
    public static void main(String[] args) {
        int []arr={8,5,7,9,6,3,2,4,8,1};
        selectionSorting(arr);
        for(int i:arr){
            System.out.print(i + " ");  
        }
    }

}
