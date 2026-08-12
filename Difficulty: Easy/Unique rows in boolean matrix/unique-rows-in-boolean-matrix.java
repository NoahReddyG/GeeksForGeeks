class Solution {
    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        
        for (int[] row : mat) 
        {
            StringBuilder sb = new StringBuilder();
            for (int val : row) {
                sb.append(val).append(",");
            }
            String rowStr = sb.toString();
            if (!seen.contains(rowStr)) 
            {
                seen.add(rowStr);
                ArrayList<Integer> currentRow = new ArrayList<>();
                for (int val : row)
                    currentRow.add(val);
                result.add(currentRow);
            }
        }
        return result;
    }
}