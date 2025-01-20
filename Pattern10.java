// Pattern10
public class Pattern10 {
    public static void main(String[] args) {
        int n = 3; // Define the n value
        int size = 2 * n + 1; // Calculate the matrix size
        int[][] matrix = new int[size][size];

        int start = size * size; // Start filling from the largest number
        int minRow = 0, maxRow = size - 1, minCol = 0, maxCol = size - 1;

        while (start > 0) {
            // Fill top row
            for (int i = minCol; i <= maxCol; i++) {
                matrix[minRow][i] = start--;
            }
            minRow++;

            // Fill right column
            for (int i = minRow; i <= maxRow; i++) {
                matrix[i][maxCol] = start--;
            }
            maxCol--;

            // Fill bottom row
            for (int i = maxCol; i >= minCol; i--) {
                matrix[maxRow][i] = start--;
            }
            maxRow--;

            // Fill left column
            for (int i = maxRow; i >= minRow; i--) {
                matrix[i][minCol] = start--;
            }
            minCol++;
        }

        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}