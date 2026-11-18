package array.set_matrix_zero;

public class SetMatrix_Brute {

    public static void main(String[] args) {
        int [][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        SetMatrix_Brute obj = new SetMatrix_Brute();
        obj.setZeroes(matrix);

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;   // row
        int m = matrix[0].length;  // col

        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (matrix[i][j] == 0) {
                    for(int row=0;row<m;row++) {
                        if (matrix[i][row] != 0) {
                            matrix[i][row] = -1;
                        }
                    }

                    for(int col=0;col<n;col++) {
                        if (matrix[col][j] != 0) {
                            matrix[col][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
