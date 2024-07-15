/**
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 

 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 

 你可以按任意顺序返回答案。 

 

 示例 1： 

 
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 

 示例 2： 

 
输入：nums = [3,2,4], target = 6
输出：[1,2]
 

 示例 3： 

 
输入：nums = [3,3], target = 6
输出：[0,1]
 

 

 提示： 

 
 2 <= nums.length <= 10⁴ 
 -10⁹ <= nums[i] <= 10⁹ 
 -10⁹ <= target <= 10⁹ 
 只会存在一个有效答案 
 

 

 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 

 Related Topics 数组 哈希表 👍 18718 👎 0

*/
package editor.cn;

import java.util.HashMap;
import java.util.Map;

//java:两数之和
class P1TwoSum{
    public static void main(String[] args){
        Solution solution = new P1TwoSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 创建一个新的hashmap, 用来存储数组元素和下标的映射关系
        Map<Integer, Integer> map = new HashMap<>();
        // 创建一个新的数组，数组长度为2，用来存储两个元素的下标
        int[] res = new int[2];
        // 遍历数组, 对于每一个元素, 计算它的差值target-nums[i], 然后在hashmap中查找是否存在这个差值
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);  // 得到第一个元素的下标
                res[1] = i;  // 得到第二个元素的下标
            }
            else
                map.put(nums[i], i);  // 存入hashmap
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
