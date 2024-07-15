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

 Related Topics 哈希表 字符串 排序 👍 933 👎 0

*/
package editor.cn;

import java.util.Arrays;

//java:有效的字母异位词
class P242ValidAnagram{
    public static void main(String[] args){
        Solution solution = new P242ValidAnagram().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        // 定义一个数组，长度为26，创建的时候如果不初始化的话，默认全部初始化为0
        int[] hash = new int[26];
        // 遍历字符串s，将每个字符的ASCII码减去'a'，然后将其对应的数组元素加1
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        // 遍历字符串t，将每个字符的ASCII码减去'a'，然后将其对应的数组元素减1
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i) - 'a']--;
        }
        // 判断最后得到的数组与原始的数组（即初始元素全部为0的数组）是否完全相等
        return Arrays.equals(hash, new int[26]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
