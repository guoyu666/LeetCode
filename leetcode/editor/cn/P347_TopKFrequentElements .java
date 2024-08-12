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
		// 定义一个HashMap，用于存储元素和其出现次数
		HashMap<Integer, Integer> map = new HashMap<>();
		// 使用加强for循环遍历数组，将元素和其出现次数放入HashMap中
		for (int num : nums){
			map.put(num,map.getOrDefault(num,0) + 1);
		}
		// 定义一个优先队列
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){ // 这里使用匿名内部类
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1]; // 按照出现次数从大到小排序
			}
		});
		for (int key : map.keySet()){ // keySet()方法返回所Map集合中所有key值
			pq.offer(new int[]{key,map.get(key)}); // 将元素和其出现次数封装成数组，放入优先队列中
			if (pq.size() > k)
				pq.poll();
		}
		// 定义一个数组，用于存储前k个高频元素
		int[] res = new int[k];
		for (int i = k - 1; i >= 0; i--){
			res[i] = pq.poll()[0];
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
