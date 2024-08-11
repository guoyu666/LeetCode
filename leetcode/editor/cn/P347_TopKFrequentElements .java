/**
给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。 

 

 示例 1: 

 
输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
 

 示例 2: 

 
输入: nums = [1], k = 1
输出: [1] 

 

 提示： 

 
 1 <= nums.length <= 10⁵ 
 k 的取值范围是 [1, 数组中不相同的元素的个数] 
 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的 
 

 

 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。 

 Related Topics 数组 哈希表 分治 桶排序 计数 快速选择 排序 堆（优先队列） 👍 1874 👎 0

*/

package editor.cn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 前 K 个高频元素
 * @author GuoYu
 * @date 2024-08-11 16:47:01
 */
class P347_TopKFrequentElements{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P347_TopKFrequentElements().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums){
			// 将所有元素的频率存入 map 中，key 为元素，value 为频率
			// getOrDefault() 方法获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		// 定义一个优先队列
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1]; // 根据频率从小大大进行排序
			}
		});
		// 将 map 中的元素存入优先队列中，元素为 [元素，频率]
		for (int key : map.keySet()){
			pq.offer(new int[]{key, map.get(key)});
			// 如果优先队列的大小超过 k ，则弹出队首元素
			if (pq.size() > k) pq.poll();
		}
		// 定义一个数组，用于存放结果
		int[] result = new int[k];
		// 从优先队列中倒序取出元素，并存入结果数组中
		for (int i = k - 1; i >= 0; i--){
			result[i] = pq.poll()[0];
		}
		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
