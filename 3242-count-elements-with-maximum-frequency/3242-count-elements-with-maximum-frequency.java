class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            int temp = hm.getOrDefault(nums[i],0);
            hm.put(nums[i],temp+1);
        }

        int max = 1;

        for(int val : hm.keySet()){
            if(hm.get(val) >= max){
                max = hm.get(val);
            }
        }
        int count = 0;
        for(int val : hm.keySet()){
            if(hm.get(val) == max){
                count = count + max;
            }
        }
        return count;
    }
}