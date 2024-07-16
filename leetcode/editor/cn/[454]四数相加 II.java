/**
 * 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
 * <p>
 * <p>
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * 输出：2
 * 解释：
 * 两个元组如下：
 * 1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) +
 * 2 = 0
 * 2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) +
 * 0 = 0
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
 * 输出：1
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == nums1.length
 * n == nums2.length
 * n == nums3.length
 * n == nums4.length
 * 1 <= n <= 200
 * -2²⁸ <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2²⁸
 * <p>
 * <p>
 * Related Topics 数组 哈希表 👍 1016 👎 0
 */
package editor.cn;

import java.util.HashMap;
import java.util.Map;

//java:四数相加 II
class P454FourSumIi {
    public static void main(String[] args) {
        Solution solution = new P454FourSumIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            // 创建HashMap，分别存储nums1和nums2的和与出现的次数
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int sum = nums1[i] + nums2[j];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
            // 遍历nums3和nums4，计算和为0的元组个数
            // count用来计算所有满足条件的元组个数
            int count = 0;
            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int sum = 0 - (nums3[i] + nums4[j]);
                    if (map.containsKey(sum)) {
                        count += map.get(sum);
                    }
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
