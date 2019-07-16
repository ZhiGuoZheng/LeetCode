/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (32.52%)
 * Likes:    1098
 * Dislikes: 0
 * Total Accepted:    136.4K
 * Total Submissions: 419.4K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {

    public int reverse(int x) {

        // 定义反转数
        long r = 0l;
        // 进行 “乘10加余” 进行反转
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }

        // 判断反转后的数是否溢出
        if (r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE) {
            return (int)r;
        } else {
            return 0;
        }
    }
}

