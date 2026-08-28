class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap key = number
        // value is aantal keren dat het getal voorkomt counter++
        // zet in volgorde op de hoogst waarde naar laagste
        //geef de key(s) terug met van k-aantal
        // zet om naar int array

        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int nummer:nums){
            frequencies.merge(nummer, 1, Integer::sum);
        }
        return frequencies.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).mapToInt(e -> e.getKey()).toArray();
    }

    }