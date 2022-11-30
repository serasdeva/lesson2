package org.homeWork;

public class TaskOne {

    public static void main(String[] args) {
        maxAreaOfIsland(grid);
    }

    static int[][] grid = new int[][]{
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1}
    };

    public static int maxAreaOfIsland(int[][] grid) {
        int maximumArea = 0;
        for (int i = 0; i < grid.length; ++i)
            for (int j = 0; j < grid[0].length; ++j)
                maximumArea = Math.max(maximumArea, recursiveFunction(grid, i, j));

        return maximumArea;
    }

    private static int recursiveFunction(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[i].length || (grid[i][j] != 1))
            return 0;

        grid[i][j] = 0;

        return recursiveFunction(grid, i + 1, j)
                + recursiveFunction(grid, i - 1, j)
                + recursiveFunction(grid, i, j + 1)
                + recursiveFunction(grid, i, j - 1)
                + 1;
    }
}
