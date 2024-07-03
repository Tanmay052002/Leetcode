class Solution {
    public int singleNonDuplicate(int[] arr) {
       int low = 0;
        int high = arr.length-1;
        
        if( arr.length == 1 || arr[0] != arr[1] ){
            return arr[0];
        }
        if(arr[high] != arr[high-1]){
            return arr[high];
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1] ){
                return arr[mid];
            }
            if(arr[mid] == arr[mid-1]){
                mid--;
            }
            if(mid%2 == 0){
                low = mid+2;
            }else{
                high = mid-1;
            }
        }
        
        return -1;
    }
}