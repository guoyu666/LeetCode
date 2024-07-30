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
 * Related Topics 数组 哈希表 👍 1019 👎 0
 */

package editor.cn;

import java.util.HashMap;

/**
 * 四数相加 II
 * @author GuoYu
 * @date 2024-07-30 09:25:14
 */
 class P454_FourSumIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P454_FourSumIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            // 创建一个HashMap，用来存放前面两个数组每个元素的和，以及每个和它们出现的次数
            HashMap<Integer, Integer> map1 = new HashMap<>();
            // 遍历数组1和数组2
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int sum = nums1[i] + nums2[j];
					// getOrDefault方法:用来获取指定键对应的值，如果没有sum这个键，则返回默认值0
                    map1.put(sum, map1.getOrDefault(sum, 0) + 1);
                }
            }

            // 记录最后的结果值
            int count = 0;

            // 遍历数组3和数组4
            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int sum = nums3[i] + nums4[j];
                    // 如果前面两个数组的和中存在当前和的负值，则说明当前和为0，满足题目的条件
                    if (map1.containsKey(-sum)) {
                        count += map1.getOrDefault(-sum, 0);
                    }
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
