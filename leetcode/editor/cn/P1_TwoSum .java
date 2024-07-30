/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 2 <= nums.length <= 10⁴
 * -10⁹ <= nums[i] <= 10⁹
 * -10⁹ <= target <= 10⁹
 * 只会存在一个有效答案
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？
 * <p>
 * Related Topics 数组 哈希表 👍 18760 👎 0
 */

package editor.cn;

import java.util.HashMap;

/**
 * 两数之和
 * @author GuoYu
 * @date 2024-07-28 01:12:38
 */
class P1_TwoSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1_TwoSum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // 创建一个数组，用于存放答案
            int[] result = new int[2];

			// 创建一个哈希表，用于存放元素和索引的映射
			HashMap<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(target - nums[i])){	// 说明找到了当前元素以及另一个元素的和等于目标值
					// 找到了另一个元素，将元素的下标索引存入数组中并返回
					result[0] = map.get(target - nums[i]);
					// 将当前元素的下标索引存入数组中
					result[1] = i;
				}
				// 由于一开始还没有向map中存入元素，所以第一次肯定走else分支
				// 由于是两个数之和，所以至少从第二次开始才有可能找到符合条件的元素
				else
					map.put(nums[i], i);
			}
			return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
