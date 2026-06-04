class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for (int n : nums){
            if(count.contains(n)){
                return true;
            }
            count.add(n);
        }
        return false;
    }
}