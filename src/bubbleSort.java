/*
    Bubble sort :-That works by repeatedly swapping the adjacent elements if there are in wrong in order 
    it is not suitable for larger data
    it worst case  and time complexity is 0(n²)

*/public class bubbleSort {

    public static void bubbleSorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={8,5,7,9,6,3,2,4,8,1};
        bubbleSorting(arr);
        for(int i:arr){
            System.out.print(i + " ");  
        }
    }
}
