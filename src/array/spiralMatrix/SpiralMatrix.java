package array.spiralMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SpiralMatrix {
    public static void main(String[] args) {

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        SpiralMatrix obj = new SpiralMatrix();
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.print(result +" ");
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        int m = matrix.length , n = matrix[0].length;

        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;

        while (srow <= erow && scol <= ecol) {

            // Starting columns
            for(int i=scol;i<=ecol;i++) {
                res.add(matrix[srow][i]);
            }

            //Right Columns
            for(int j=srow+1;j<=erow;j++) {
                res.add(matrix[j][ecol]);
            }

            //Bottom columns
            for(int i=ecol-1;i>=scol;i--) {
                if (srow == erow) {
                    break;
                }
                res.add(matrix[erow][i]);
            }

            //Left Columns
            for (int j=erow-1;j>=srow+1;j--) {
                if (scol == ecol) {
                    break;
                }
                res.add(matrix[j][scol]);
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return res;
    }
}
