package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhiguo.zheng
 * @time 2019/6/22 10:42
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};

    }
}
