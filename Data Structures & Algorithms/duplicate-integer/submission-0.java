class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set uniqueNumbers = new HashSet();
        for(int num : nums) {
           if (!uniqueNumbers.add(num)){
                return true;
            }
        }
        return false;
    }
}