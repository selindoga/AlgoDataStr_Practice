package Max_Area_of_Island;
// 695. Max Area of Island

public class Solution {
    int ans = 0;
    boolean seen[][];
    int grid[][];
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        seen = new boolean[grid.length][grid[0].length];
        for(int r = 0; r<grid.length ; r++){
            for (int c = 0; c<grid[0].length; c++){
                ans = Math.max(ans, area(r,c));
            }
        }
        return ans;
    }
    public int area(int r, int c){
        if(r<0 || r>=grid.length ||
                c<0 || c>=grid[0].length ||
                grid[r][c]==0 || seen[r][c]){
            return 0;
        }
        else {
            seen[r][c] = true;
            return ( 1 + area(r-1,c)
                    + area(r+1,c) + area(r,c-1)
                    + area(r,c+1) );
        }
    }

}
