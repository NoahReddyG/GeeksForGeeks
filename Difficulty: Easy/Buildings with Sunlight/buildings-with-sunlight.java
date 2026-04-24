class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int n = arr.length;
        int maxHeightToTheLeft = arr[0];
        int noSunligthBuildings = 0;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < maxHeightToTheLeft){
                noSunligthBuildings++;
            }
            maxHeightToTheLeft = Math.max(maxHeightToTheLeft , arr[i]);
        }
        
        return (n - noSunligthBuildings);
    }
}

