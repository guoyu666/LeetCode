/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其总和大于等于 target 的长度最小的 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度
 * 。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= target <= 10⁹
 * 1 <= nums.length <= 10⁵
 * 1 <= nums[i] <= 10⁵
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：
 * <p>
 * <p>
 * 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
 * <p>
 * <p>
 * Related Topics 数组 二分查找 前缀和 滑动窗口 👍 2166 👎 0
 */
package editor.cn;

//java:长度最小的子数组
class P209MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new P209MinimumSizeSubarraySum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int ans = Integer.MAX_VALUE;
            int begin = 0;
            int subSum = 0;
            int subLength = 0;
            for (int end = 0; end < nums.length; end++) {
                subSum += nums[end];
                while(subSum >= target) {
                    subSum -= nums[begin];
                    subLength = end - begin + 1;
                    ans = subLength < ans? subLength : ans;
                    begin++;
                }
            }
            return ans == Integer.MAX_VALUE? 0 : ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
