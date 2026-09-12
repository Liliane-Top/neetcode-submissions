class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> result = new HashSet<>();
        for(int num: nums) {
            result.add(num);
        }
        int higestConsequetive = 1;
        int value = 0;

        for(int num : result){
            int start = num -1;
            if(!result.contains(start)){
                value = 1;
                while(result.contains(++num)) {
                    value++;
                    if(value > higestConsequetive) {
                        higestConsequetive = value;
                    }
                }
                value = 0;
            }
        }
        return higestConsequetive;
    }
        
        
}
