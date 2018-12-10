package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 【杨辉三角】
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2018/12/10 21:26
 * @version V1.0
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        // 非负整数为 0 时
        if (numRows == 0) {
            return triangle;
        }

        // 第一行数字永远是 单数1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            // 新建当前行并获取前一行
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // 每一行的第一个数字永远是 1
            row.add(1);

            // 遍历前一行并进行计算
            for (int i = 1; i < rowNum; i++) {
                row.add(prevRow.get(i - 1) + prevRow.get(i));
            }

            // 每一行的最后一个数字永远是 1
            row.add(1);

            // 将第 rowNum+1 行数据加入杨辉三角中
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(7));
    }
}
