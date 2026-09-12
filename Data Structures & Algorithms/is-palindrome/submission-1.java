class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) {return true;}
        int begin = 0;
        int einde = s.length() - 1;

        while (begin < einde) {
            while (begin < einde && !Character.isLetterOrDigit(s.charAt(begin))) {
                begin++;
            }
            while (einde > begin && !Character.isLetterOrDigit(s.charAt(einde))) {
                einde--;
            }
            if (Character.toLowerCase(s.charAt(begin)) != Character.toLowerCase(s.charAt(einde))) {
                return false;
            }
            begin++;
            einde--;
        }
        return true;
    }
}
