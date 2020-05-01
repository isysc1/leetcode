package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/15
 */
class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        // 设置最大岛屿的变量，一会用来return
        int max = 0;
        // 遍历矩阵，进行DFS（深度遍历），就是去看周围到底还存在多少个岛屿
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        // 如果越界就直接返回0
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        // 把找到的的岛屿设置为0，防止重复遍历
        grid[i][j] = 0;
        // 递归的去找岛屿的周围是否存在岛屿
        return 1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1)
                + dfs(grid, i, j + 1);
    }
}
