class Solution {
    public void rotateMatrix(int[][] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++)
        {
            int x=0, y= n - 1;
            while(x<y)
            {
                int temp = arr[x][j];
                arr[x][j]=arr[y][j];
                arr[y][j]=temp;
                x++;
                y--;
            }
        }
    }
}