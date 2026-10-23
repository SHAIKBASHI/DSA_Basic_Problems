import java.util.Arrays;
import org.junit.runners.JUnit4;

public class NQueensOptimized {

    // Change this value to solve for different board sizes
    private static final int N = 4; 

    // Lookups arrays to check safety in O(1) time
    private static boolean[] cols;
    private static boolean[] mainDiag;
    private static boolean[] antiDiag;

    public static void main(String[] args) {
        // Initialize lookup arrays based on N
        cols = new boolean[N];
        mainDiag = new boolean[2 * N - 1];
        antiDiag = new boolean[2 * N - 1];

        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists for N = " + N);
        }
    }

    /**
     * Recursive backtracking function with O(1) tracking lookups.
     */
    @Test
    private static boolean solveNQueens(int[][] board, int row) {
        // Base Case: If all queens are placed, print the board
        if (row == N) {
            printBoard(board);
            return true; // Return true to find the first valid solution
        }

        for (int col = 0; col < N; col++) {
            int diagIdx = row - col + (N - 1);
            int antiDiagIdx = row + col;

            // O(1) Safety Check
            if (!cols[col] && !mainDiag[diagIdx] && !antiDiag[antiDiagIdx]) {
                
                // Place the queen and mark constraints as occupied
                board[row][col] = 1;
                cols[col] = true;
                mainDiag[diagIdx] = true;
                antiDiag[antiDiagIdx] = true;

                // Move to the next row
                if (solveNQueens(board, row + 1)) {
                    return true;
                }

                // BACKTRACK: Remove the queen and clear constraints
                board[row][col] = 0;
                cols[col] = false;
                mainDiag[diagIdx] = false;
                antiDiag[antiDiagIdx] = false;
            }
        }

        return false;
    }

    /**
     * Utility function to print the chessboard.
     */
    private static void printBoard(int[][] board) {
        System.out.println("Optimized Solution Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] == 1 ? " Q " : " . ");
            }
            System.out.println();
        }
        System.out.println();
    }
}