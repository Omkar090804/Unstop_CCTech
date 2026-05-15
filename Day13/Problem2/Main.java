import java.util.*;

class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    // Variables to store boundaries
    static int minRow, minCol, maxRow, maxCol;

    // DFS function
    public static void dfs(int x, int y, int n, int m,
                           int[][] grid, boolean[][] visited) {

        visited[x][y] = true;

        // Update boundaries
        minRow = Math.min(minRow, x);
        minCol = Math.min(minCol, y);
        maxRow = Math.max(maxRow, x);
        maxCol = Math.max(maxCol, y);

        // Visit adjacent cells
        for (int k = 0; k < 4; k++) {

            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= 0 && nx < n &&
                ny >= 0 && ny < m &&
                grid[nx][ny] == 1 &&
                !visited[nx][ny]) {

                dfs(nx, ny, n, m, grid, visited);
            }
        }
    }

    public static void user_logic(int n, int m, int[][] grid) {

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                // New water body found
                if (grid[i][j] == 1 && !visited[i][j]) {

                    minRow = i;
                    minCol = j;
                    maxRow = i;
                    maxCol = j;

                    dfs(i, j, n, m, grid, visited);

                    // Print upper-left and bottom-right cells
                    System.out.println(
                        minRow + " " + minCol + " " +
                        maxRow + " " + maxCol
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        user_logic(n, m, grid);
    }
}