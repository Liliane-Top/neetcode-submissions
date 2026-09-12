class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = t.length();
        if(l < 2) return true;
    
        for(int i = 0; i < l/2; i++) {
            String begin = t.substring(i, i+1);
            String end = t.substring(l - (i + 1), l - (i));

            if(!begin.equalsIgnoreCase(end))
            return false;
        }
        return true;
        
    }
}
