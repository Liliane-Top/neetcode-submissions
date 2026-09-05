class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check each row for duplicates
        // check each column for duplicates
        // check each box

        Map<String, Set<Character>> boxMap = new HashMap<>();
        Map <Integer, Set<Character>> columns = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            int j = 0;
            Set<Character> row = new HashSet<>();
            while (j < 9) {
                if (board[i][j] != '.') { // check row
                    if (!row.add(board[i][j])) {
                        return false;
                    }
            if (!columns.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j])) { // check column
                        return false;
                    }

                    String key = j / 3 + "," + i / 3;

                    if(!boxMap.computeIfAbsent(key, k -> new HashSet<>()).add(board[i][j])) { // check box
                        return false;
                    }
                }
                j++;
            }
        }
        return true;
    }
}
