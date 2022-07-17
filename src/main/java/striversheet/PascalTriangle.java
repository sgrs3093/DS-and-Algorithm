package striversheet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/
 *
 */
public class PascalTriangle
{
    public static void main (String[] args)
    {
        int n = 5;
        List<List<Integer>> result = printPascal(n);
        System.out.println(result);

        for (List<Integer> i : result) {
            System.out.println(i);
        }

    }

    /**
     * Don't format this code
     *            1
     *          1   1
     *        1   2   1
     *      1   3   3    1
     *    1   4   6   4    1
     */
    static List<List<Integer>> printPascal (int n)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < n; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            result.add(row);

        }
        return result;
    }
}
