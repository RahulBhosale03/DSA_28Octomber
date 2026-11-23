package array.pasclesTriangle_2;

import java.util.ArrayList;
import java.util.List;

public class PasclesTriangle {
    public static void main(String[] args) {
        int rowIndex = 3;
        PasclesTriangle obj = new PasclesTriangle();
        List<Integer> result = obj.getRow(rowIndex);
        System.out.println(result);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        for (int i=0;i<=rowIndex;i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j=0;j<=i;j++) {
                if (j==0 || j==i) {
                    curr.add(1);
                }else {
                    int value = prev.get(j) + prev.get(j-1);
                    curr.add(value);
                }
            }
            prev = curr;
        }
        return prev;
    }
}
