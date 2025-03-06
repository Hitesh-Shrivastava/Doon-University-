public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, -3},
            {4, 5, 6},
            {7, 8, -9}
        };

        int primarySum = 0, secondarySum = 0, n = matrix.length;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - i - 1];
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
