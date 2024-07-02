class Solution {
    public int search(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                return mid;
            }else if(k > arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return -1;
    }
}