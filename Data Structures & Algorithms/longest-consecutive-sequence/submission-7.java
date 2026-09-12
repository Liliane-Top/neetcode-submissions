class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> result = new HashSet<>();

        for(int num: nums) {
            result.add(num);
        }

        int longestConsequetive = 1;

        for(int num : result){
            if(!result.contains(num - 1)){
                int length = 1;
                while(result.contains(++num)) {
                    length++;
                    longestConsequetive = Math.max(length, longestConsequetive);
                }
            }
        }
        return longestConsequetive;
    }
        
        
}
