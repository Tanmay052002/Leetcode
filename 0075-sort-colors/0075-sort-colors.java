class Solution {
    public void sortColors(int[] arr) {
        // Simple Bubble Sort 
        for(int i = 1; i < arr.length ; i++ ){
            for(int  j = 0 ; j < arr.length-i; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}