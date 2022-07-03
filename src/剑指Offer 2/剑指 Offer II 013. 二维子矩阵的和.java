class NumMatrix {
    //辅助矩阵，坐标sums[row + 1][col + 1]存入的是matrix[0][0]到matrix[row][col]矩阵的和
    private int[][] sums;
    //初始化辅助矩阵，为方便计算，sums行列数各+1
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        //遍历计算辅助矩阵，每行的值为上一个单元格的值加当前行的和
        sums = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                sums[i+1][j+1] = sums[i][j + 1] + rowSum;
            }
        }
    }
    //使用辅助矩阵计算指定矩阵区域的和
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {

    }
}