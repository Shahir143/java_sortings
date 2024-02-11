public class mergeSort {
    public static void mergeSortInsert(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSortInsert(arr, start, mid);
        mergeSortInsert(arr, mid+1, end);
        mergeSorting(arr,start,mid,end);
    }
    public static void mergeSorting(int []arr, int si, int mid,int ei) {
        int i=si;
        int j=mid+1;
        int k=0;
        int[] temp=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int []arr={8,5,7,9,6,3,2,4,8,1};
        mergeSortInsert(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i + " ");  
        }
    }
}
