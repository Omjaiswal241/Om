// Pattern8
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1; // Size of the square matrix

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(n - min + " ");
            }
            System.out.println();
        }
    }
}