import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        int row = 0;

        for (int i = 0; i < n; i++) {
            if (find(matrix[i], k)) {
                row = i + 1;
                break;
            }
        }

        System.out.println(row);
    }


    /* find whether there exist k consecutive available seats */
    static boolean find(int[] array, int k) {

        boolean result = false;

        for (int i = 0; i <= array.length - k; i++) {

            result = true;

            for (int j = i; j < i + k; j++) {
                if (array[j] == 1) {
                    result = false;
                    break;
                }
            }

            if (result) {
                break;
            }

        }

        return result;
    }
}