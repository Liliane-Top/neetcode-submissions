class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> anagrams = new HashMap<>();
       //iterate over strs 
       // sort the word and use that as key
       // add all the words to different key
       // transform a map to a list
       for (String word: strs){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
       }
    //    return anagrams.values().stream().toList();
    return new ArrayList<>(anagrams.values()); // de values() van de map heeft zelfde structuur als List<List<String>> dus kan direct via constructor worden omgezet
    }
}
