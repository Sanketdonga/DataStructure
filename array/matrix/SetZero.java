public class SetZero {
    public static int[][] setZeroes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        boolean[] zeroAtRow = new boolean[row];
        boolean[] zeroAtCol = new boolean[col];

        // First pass to identify which rows and columns should be zeroed
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    zeroAtRow[i] = true;
                    zeroAtCol[j] = true;
                }
            }
        }

        // Second pass to zero out the rows
        for (int i = 0; i < row; i++) {
            if (zeroAtRow[i]) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Third pass to zero out the columns
        for (int j = 0; j < col; j++) {  
            if (zeroAtCol[j]) {          
                for (int i = 0; i < row; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
