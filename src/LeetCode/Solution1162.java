// package LeetCode;
//
// /**
//  * @author isysc1@163.com
//  * @date 2020/3/29
//  */
// class Solution1162 {
//     class Point {
//         int x;
//         int y;
//         int step;   //陆地层数，最初的陆地为0层
//
//         public Point(int a, int b, int c) {
//             x = a;
//             y = b;
//             step = c;
//         }
//     }
//
//     public int maxDistance(int[][] grid) {
//         Queue<Point> que = new LinkedList<>();
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
//                 if (grid[i][j] == 1) que.add(new Point(i, j, 0));
//             }
//         }
//         if (que.isEmpty() || que.size() == grid.length * grid[0].length) return -1;
//         Point p = null;
//         while (!que.isEmpty()) {
//             p = que.remove();
//             int x = p.x;
//             int y = p.y;
//             int step = p.step;
//             if (x + 1 < grid.length && grid[x + 1][y] == 0) {
//                 grid[x + 1][y] = 1;  //填海
//                 que.add(new Point(x + 1, y, step + 1));
//             }
//             if (x - 1 >= 0 && grid[x - 1][y] == 0) {
//                 grid[x - 1][y] = 1;
//                 que.add(new Point(x - 1, y, step + 1));
//             }
//             if (y + 1 < grid[0].length && grid[x][y + 1] == 0) {
//                 grid[x][y + 1] = 1;
//                 que.add(new Point(x, y + 1, step + 1));
//             }
//             if (y - 1 >= 0 && grid[x][y - 1] == 0) {
//                 grid[x][y - 1] = 1;
//                 que.add(new Point(x, y - 1, step + 1));
//             }
//         }
//         return p.step;
//     }
// }