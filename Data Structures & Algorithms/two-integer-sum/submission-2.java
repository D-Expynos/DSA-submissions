class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (copy[i] + copy[j] == target) {

                int a = -1;
                int b = -1;

                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == copy[i] && a == -1) {
                        a = k;
                    } else if (nums[k] == copy[j] && b == -1) {
                        b = k;
                    }
                }
                if(a<b){
                    return new int[]{a, b};
                }
                else{
                    return new int[]{b, a};
                }
            }

            if (copy[i] + copy[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{};
    }
}