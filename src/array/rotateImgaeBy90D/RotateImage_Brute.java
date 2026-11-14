package array.rotateImgaeBy90D;

import java.util.Arrays;

public class RotateImage_Brute {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        RotateImage_Brute obj = new RotateImage_Brute();
        obj.rotateMatrix(matrix);
        for (int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;
        int [][] result = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                result[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}
