package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhiguo.zheng
 * @time 2019/6/22 10:42
 */
public class TwoSum {
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
