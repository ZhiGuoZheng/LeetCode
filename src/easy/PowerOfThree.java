package easy;

/**

 * Created by MER on 2018/9/16
 * Time: 16:34
 * Description: 【3的幂】
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 * 输入: 27
 * 输出: true
 *
 * 示例 2:
 * 输入: 0
 * 输出: false
 *
 * 示例 3:
 * 输入: 9
 * 输出: true
 *
 * 示例 4:
 * 输入: 45
 * 输出: false
 *
 * Complexity Analysis
 *   ·Time complexity: O(logb(n))
 *   ·Space complexity: O(1)
 */

public class PowerOfThree {

    private boolean isPowerOfThree(int n) {

        // n 为0或者负数时直接返回 false
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfThree powerOfThree = new PowerOfThree();
        int[] testNum = {27, 0, 9, 45};

        for (int num : testNum) {
            System.out.println(powerOfThree.isPowerOfThree(num));
        }
    }
}
