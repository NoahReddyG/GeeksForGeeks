class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        int size = mat.length;
        ArrayList<Integer> ans = new ArrayList<>(size * size);
        for(int i = 0; i < size; i++) 
        {
            int r = 0;
            int c = i;
            
            while(r < size && c >= 0) 
            {
                ans.add(mat[r][c]);
                r++;
                c--;
            }
        }
        for(int i = 1; i < size; i++) 
        {
            int r = i;
            int c = size-1;
            
            while(r < size && c >= 0) 
            {
                ans.add(mat[r][c]);
                r++;
                c--;
            }
        }
        return ans;
    }
}