class Solution {
    public int orangesRot(int[][] grid) {
        if(grid==null||grid.length==0)
        return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int freshCount=0;
        for (int r=0;r<rows;r++) 
        {
            for (int c=0;c<cols;c++) 
            {
                if (grid[r][c]==2) 
                {
                    queue.offer(new int[]{r,c});
                } 
                else if (grid[r][c]==1) 
                {
                    freshCount++;
                }
            }
        }
        if(freshCount==0)
        return 0;
        int min=0;
        int dir[][]={{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!queue.isEmpty()) 
        {
            int size=queue.size();
            boolean rottedInThisTurn=false;
            for (int i=0;i<size;i++) 
            {
                int[] curr=queue.poll();
                for (int[] d:dir) 
                {
                    int nextR=curr[0]+d[0];
                    int nextC=curr[1]+d[1];
                    if (nextR>=0 && nextR<rows && nextC>=0 && nextC<cols && grid[nextR][nextC]==1) 
                    {
                        grid[nextR][nextC]=2;
                        queue.offer(new int[]{nextR, nextC});
                        freshCount--;
                        rottedInThisTurn=true;
                    }
                }
            }
            if (rottedInThisTurn) 
            min++;
        }
        return freshCount==0?min:-1;
    }
}