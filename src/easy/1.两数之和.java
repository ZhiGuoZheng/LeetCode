/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (46.18%)
 * Likes:    5465
 * Dislikes: 0
 * Total Accepted:    410.5K
 * Total Submissions: 889K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 */
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
                
        // 新建map
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            // 获取差值
            temp = target - nums[i];
            // 判断 map 中是否存在差值
            if (map.containsKey(temp)) {
                // 返回结果
                return new int[] {map.get(temp), i};
            }
            // 将该值及索引放入 map 中
            map.put(nums[i], i);
        }
        // 不存在
        return new int[]{-1, -1};

    }
}

