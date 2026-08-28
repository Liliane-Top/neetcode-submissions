class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            // 7 - 3 = 4
            //map.put (3, 0)
            //7 - 4 = 3 => is bestaande key
            //return  de index van de key en de huidige index 0, 1

            if (map.containsKey(key)) {
                return new int[] {map.get(key), i};
            } else {
                map.put(nums[i], i);
            }

        }

       return null; 
    }
}
