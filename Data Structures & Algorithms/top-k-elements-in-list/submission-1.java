class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //improve timecomplexity by using priority queue

        Map<Integer, Integer> frequencies = new HashMap<>();

        Queue<Map.Entry<Integer, Integer>> rij = new PriorityQueue<>(Map.Entry.<Integer,Integer>comparingByValue());

        for(int nummer:nums){
            frequencies.merge(nummer, 1, Integer::sum);
        }

        for (Map.Entry<Integer,Integer> entry: frequencies.entrySet()) {
                rij.add(entry);
            if(rij.size() > k) {
                rij.poll();
            }
        }

        return rij.stream().mapToInt(e -> e.getKey()).toArray();
    }

    }