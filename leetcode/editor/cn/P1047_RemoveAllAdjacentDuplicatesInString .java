/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * <p>
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * <p>
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有
 * "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 * <p>
 * <p>
 * Related Topics 栈 字符串 👍 643 👎 0
 */

package editor.cn;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 删除字符串中的所有相邻重复项
 * @author GuoYu
 * @date 2024-08-05 10:25:05
 */
class P1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1047_RemoveAllAdjacentDuplicatesInString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeDuplicates(String s) {
			// 创建栈
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (stack.isEmpty() || stack.peek() != c) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }

            // 创建空的StringBuilder,用来存放结果字符串
            // 而且StringBuilder中是使用字符数组来保存字符串的，所以最后要使用toSting()方法转换为字符串
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
			// 由于栈是倒序存放，所以需要反转StringBuilder的结果
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
