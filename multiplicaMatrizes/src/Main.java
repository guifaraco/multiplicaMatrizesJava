public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = { {3, 1, 3}, {6, 5, 5} };
        int[][] matrix2 = { {100, 50}, {50, 100}, {50, 50} };

        int[][] result = multi(matrix1, matrix2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] multi(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix1[0].length;
        int p = matrix2[0].length;

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}