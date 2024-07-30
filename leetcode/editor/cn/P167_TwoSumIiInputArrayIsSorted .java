/**
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列 ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个
 * 数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.
 * length 。
 * <p>
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * <p>
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * <p>
 * 你所设计的解决方案必须只使用常量级的额外空间。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：numbers = [2,7,11,15], target = 9
 * 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：numbers = [2,3,4], target = 6
 * 输出：[1,3]
 * 解释：2 与 4 之和等于目标数 6 。因此 index1 = 1, index2 = 3 。返回 [1, 3] 。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：numbers = [-1,0], target = -1
 * 输出：[1,2]
 * 解释：-1 与 0 之和等于目标数 -1 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 2 <= numbers.length <= 3 * 10⁴
 * -1000 <= numbers[i] <= 1000
 * numbers 按 非递减顺序 排列
 * -1000 <= target <= 1000
 * 仅存在一个有效答案
 * <p>
 * <p>
 * Related Topics 数组 双指针 二分查找 👍 1215 👎 0
 */

package editor.cn;

/**
 * 两数之和 II - 输入有序数组
 * @author GuoYu
 * @date 2024-07-30 10:21:17
 */
class P167_TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P167_TwoSumIiInputArrayIsSorted().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            // 定义两个指针，分别指向数组的头尾
            int left = 0, right = numbers.length - 1;
            // 循环直到两个指针相遇
            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    // 这里题目规定的是数组的下标从1开始，所以这里的两个指针都需要+1
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else
                    right--;
            }
            return new int[]{left, right};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
