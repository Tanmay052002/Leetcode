class Solution {
    public int searchInsert(int[] arr, int k) {

        if(k < arr[0]){
            return 0;
        }
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
        
        // if it's not mid then always low show the floor value(ex-> 5.5 then floor = 5)  
        return low;
    }
}