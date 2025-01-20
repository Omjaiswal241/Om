// Hollow Hour Glass Pattern
public class Hollowhourglass {
    public static void main(String[] args) {
        int n = 5; // Size of the hourglass
        char ch = 'A';

        // Upper part of the hourglass
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print characters
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                if (i==0||j == 0 || j == (2 * (n - i) - 2)) {
                    System.out.print((char) (ch + j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = 1; i < n; i++) {
            // Print leading spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print characters
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j == 0 || j == (2 * i)||i==n-1) {
                    System.out.print((char) (ch + j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}