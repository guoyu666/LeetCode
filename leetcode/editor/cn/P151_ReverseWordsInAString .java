/**
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * <p>
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * <p>
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * <p>
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：反转后的字符串中不能存在前导空格和尾随空格。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：s = "a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 10⁴
 * s 包含英文大小写字母、数字和空格 ' '
 * s 中 至少存在一个 单词
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：如果字符串在你使用的编程语言中是一种可变数据类型，请尝试使用 O(1) 额外空间复杂度的 原地 解法。
 * <p>
 * Related Topics 双指针 字符串 👍 1187 👎 0
 */

package editor.cn;

/**
 * 反转字符串中的单词
 *
 * @author GuoYu
 * @date 2024-08-02 09:43:41
 */
class P151_ReverseWordsInAString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P151_ReverseWordsInAString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            // 去除前后空格
            s = s.trim();
            // 定义StringBuilder,用来存放最后的结果
            StringBuilder res = new StringBuilder();
            int length = s.length(); // 字符串长度
            // 定义快慢指针
            int slow, fast;
            slow = fast = length - 1; // 快指针指向最后一个字符
            while (fast >= 0) {
                while (fast >= 0 && s.charAt(fast) != ' ') fast--; // 找到第一个空格的位置
                // 运行到此代表fast指针指向第一个空格的位置，然后将找到的单词添加到res中
                res.append(s.substring(fast + 1, slow + 1) + " ");
                // fast指针跳过中间为空格的位置
                while (fast >= 0 && s.charAt(fast) == ' ') fast--;
                // 运行到此代表fast指针指向了第二个单词的位置，然后更新slow指针
                slow = fast;
            }
            return res.toString().trim();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
