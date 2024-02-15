/*
 * Binary search is a searching alogorithm
 * it is faster than the linear search especially for large arrays
 * Binary search is a searching algorithm is used in only sorted arrays 
 * by dividing repeatedly half intervals of arrays 
 * 
 * Best case =0(1);
 * Average case =0(log n);
 * Worst case =0(log n);
 */

public class binarySearch {
    public static void main(String[] args) {
		int []arr= {4,5,6,7,0,1,2};
        int target=6;
		int res=checkNum(arr,target);
		System.out.println(res);
	}

	public static int checkNum(int[] arr,int target) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>arr[j]){
				if(arr[mid]>target && arr[i]<=target) {
					j=mid-1;
				}else {
					i=mid+1;
				}
			}
			else {
				if(arr[mid]<target && arr[j]>target) {
					i=mid+1;
				}else {
					j=mid-1;
				}
			}
		}
		return -1;
	}
}
