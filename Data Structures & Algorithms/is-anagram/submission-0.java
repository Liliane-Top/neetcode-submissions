class Solution {
    public boolean isAnagram(String s, String t) {
       char[] sOrdered =s.toCharArray();
       Arrays.sort(sOrdered);
       String sOrderedString = new String(sOrdered);
       System.out.println(sOrderedString);
    char[] tOrdered = t.toCharArray();
    Arrays.sort(tOrdered);
    String tOrderedString = new String(tOrdered);
           System.out.println(tOrderedString);
       return sOrderedString.equals(tOrderedString);
    }
}
