/**
给定两个数组 nums1 和 nums2 ，返回 它们的 交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。 

 

 示例 1： 

 
输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2]
 

 示例 2： 

 
输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出：[9,4]
解释：[4,9] 也是可通过的
 

 

 提示： 

 
 1 <= nums1.length, nums2.length <= 1000 
 0 <= nums1[i], nums2[i] <= 1000 
 

 Related Topics 数组 哈希表 双指针 二分查找 排序 👍 924 👎 0

*/

package editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 * @author GuoYu
 * @date 2024-07-28 00:58:36
 */
class P349_IntersectionOfTwoArrays{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P349_IntersectionOfTwoArrays().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		// 创建一个HashSet，用于存储nums1中的元素
		Set<Integer> set1 = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}
		// 创建一个HashSet，用于存储nums2中的元素
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums2) {
			set2.add(i);
		}
		// 交集的结果,创建一个空的HashSet，用来存放交集的元素
		Set<Integer> result = new HashSet<>();
		for (int i : set1) {
			if (set2.contains(i))
				result.add(i);
		}
		int[] res = new int[result.size()];
		int i = 0;
		for (Integer num : result) {
			res[i++] = num;
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
