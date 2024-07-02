class Solution {
    public int[] rotate(int[] arr, int k) {

        k = k % arr.length;

        swap(arr,0,(arr.length-1)-k);
        swap(arr,(arr.length-k),(arr.length-1));
        swap(arr,0,arr.length-1);
        
        return arr;
    }
    
    public static void swap(int arr[],int sp,int ed){
        
        while(sp<ed){
            int temp = arr[sp];
            arr[sp] = arr[ed];
            arr[ed] = temp;
            
            sp++;
            ed--;
        }
        
    }
}