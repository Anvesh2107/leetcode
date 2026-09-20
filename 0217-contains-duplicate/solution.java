class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seek=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seek.contains(nums[i])){
                return true;
            }
            seek.add(nums[i]);
        }
        return false;
    }
}
