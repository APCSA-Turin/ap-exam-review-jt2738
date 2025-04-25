package Day5;

public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        for(int r=0; r< grid.length;r++){
            for(int c=0; c<grid[r].length;c++){
                int val= (int) (Math.random()*(MAX -1 +1)+1);
                while ((!(val%10==0)) || (val%100==0)) {
                    val= (int) (Math.random()*(MAX -1 +1)+1);
                }
                grid[r][c]=val;
            }
        }
    }

    public int countIncreasingCols() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with DataTester
        int count = 0;
        for (int col = 0; col < grid[0].length; col++) {
            boolean ordered = true;
                for (int row = 1; row < grid.length; row++) {
                    if (grid[row][col] < grid[row-1][col]) {
                        ordered = false;
                    }
                }
                if (ordered) {
                    count++;
                }
            }
        return count;
    }
 
}

