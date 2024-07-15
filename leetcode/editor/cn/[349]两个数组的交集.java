/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的 交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * <p>
 * Related Topics 数组 哈希表 双指针 二分查找 排序 👍 918 👎 0
 */
package editor.cn;

import java.util.HashSet;
import java.util.Set;

//java:两个数组的交集
class P349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new P349IntersectionOfTwoArrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            // 遍历nums1，将其元素放入set中
            for (int k : nums1) {
                set.add(k);
            }
            Set<Integer> resSet = new HashSet<>();
            // 遍历nums2，如果set中存在该元素，则放入res中
            for (int k : nums2) {
                if (set.contains(k)) {
                    resSet.add(k);
                }
            }

            //  创建一个新的数组，长度为res的大小
            int[] resArr = new int[resSet.size()];
            int index = 0;
            // 遍历resSet，将其元素放入resArr中
            for (int i : resSet) {
                resArr[index++] = i;
            }
            return resArr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
