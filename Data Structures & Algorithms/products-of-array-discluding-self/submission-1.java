class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);    // Nu bevat de array [1, 1, 1, 1, 1]
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] == 1) {
                continue;
            }
            int j = 0;
            while(j < nums.length) {
                if(j != i) {
                    output[j] = output[j] * nums[i];
                }
                 j++;
            }
    }   
    return output;
    }
}  
