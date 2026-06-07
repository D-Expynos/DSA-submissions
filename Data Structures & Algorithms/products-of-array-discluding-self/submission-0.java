class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean oneZero = false;
        boolean twoZero = false;
        int total = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0 && oneZero == true){
                twoZero = true;
                break;
            }
            if(nums[i] == 0){
                oneZero = true;
                continue;
            }
            total = total * nums[i];
        }
        int[] ans = new int[nums.length];
        if(twoZero == true){
            return ans;
        }
        for(int i = 0; i < nums.length; i++){
            if(oneZero == true && nums[i] != 0){
                ans[i] = 0;
                continue;
            }
            else if(oneZero == true){
                ans[i] = total;
            }
            else {
                ans[i] = total / nums[i];
            }
        }
        return ans;
    }
}  
