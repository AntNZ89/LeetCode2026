package january.easy;

public class CountNegatives {
    public int countNegatives(int[][] grid) {

        int ans = 0;

        for (int r = 0 ; r < grid.length ; r++){
            for (int c = 0 ; c < grid[0].length ; c++){
                if (grid[r][c] < 0){
                    ans++;
                }
            }
        }

        return ans;

    }
}
