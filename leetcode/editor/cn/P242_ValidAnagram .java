/**
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 

 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 

 

 示例 1: 

 
输入: s = "anagram", t = "nagaram"
输出: true
 

 示例 2: 

 
输入: s = "rat", t = "car"
输出: false 

 

 提示: 

 
 1 <= s.length, t.length <= 5 * 10⁴ 
 s 和 t 仅包含小写字母 
 

 

 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 

 Related Topics 哈希表 字符串 排序 👍 939 👎 0

*/

package editor.cn;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * @author GuoYu
 * @date 2024-07-28 00:45:13
 */
class P242_ValidAnagram{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P242_ValidAnagram().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		// 定义一个数组，长度为26，用于统计每个字母出现的次数，创建的时候全部初始化为0
		int[] hash = new int[26];
		// 遍历字符串s，将每个字母的ASCII码减去'a'，作为数组的下标，将对应的值加1
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i) - 'a']++;
		}
		// 遍历字符串t，将每个字母的ASCII码减去'a'，作为数组的下标，将对应的值减1
		for (int i = 0; i < t.length(); i++) {
			hash[t.charAt(i) - 'a']--;
		}
		// 遍历数组，如果有值不为0，说明两个字符串中字母出现的次数不同，返回false
        return Arrays.equals(hash, new int[26]);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
