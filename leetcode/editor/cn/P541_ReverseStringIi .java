/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * <p>
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 10⁴
 * s 仅由小写英文组成
 * 1 <= k <= 10⁴
 * <p>
 * <p>
 * Related Topics 双指针 字符串 👍 612 👎 0
 */

package editor.cn;

/**
 * 反转字符串 II
 * @author GuoYu
 * @date 2024-07-31 02:25:46
 */
class P541_ReverseStringIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P541_ReverseStringIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseStr(String s, int k) {
            // 字符串的长度
            int len = s.length();
            char[] chars = s.toCharArray();
            for (int i = 0; i < len; i += 2 * k) {
                if (i + k <= len) {
                    reverseString(chars, i, i + k - 1);
                } else {
                    reverseString(chars, i, len - 1);
                }
            }
            return new String(chars);
        }

        public void reverseString(char[] s, int start, int end) {
            int i = start;
            int j = end;
            while (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
