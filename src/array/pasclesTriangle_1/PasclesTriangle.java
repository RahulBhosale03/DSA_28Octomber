package array.pasclesTriangle_1;

import java.util.ArrayList;
import java.util.List;

public class PasclesTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        PasclesTriangle obj = new PasclesTriangle();
        List<List<Integer>> res = obj.generate(numRows);
        System.out.print(res);
    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j=0;j<=i;j++) {
                if (j==0 || j==i) {
                    rows.add(1);
                }else {
                    int value =
                                result.get(i-1).get(j)
                             +  result.get(i-1).get(j-1);
                    rows.add(value);
                }
            }
            result.add(rows);
        }
        return result;
    }
}
