class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                // int num = nums[i];
                return nums[i];
            }else{
            hs.add(nums[i]);
            }
        }
        
        return 0;
    }
}