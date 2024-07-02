class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            int idx = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == temp) {
                    idx = j;
                }
            }
            int temp2 = -1;
        for (int j = idx; j < nums2.length; j++) {
            if(temp < nums2[j]){
                temp2 = nums2[j];
                break;
            }
        }
        ans[i] = temp2;
        }
        return ans;
    }
}