/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * Related Topics 链表 双指针 👍 2899 👎 0
 */

package editor.cn;

/**
 * 删除链表的倒数第 N 个结点
 * @author GuoYu
 * @date 2024-07-26 10:57:07
 */
class P19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
			// 创建一个虚拟的头节点
			ListNode dummy = new ListNode();
			dummy.next = head;
			// 定义快慢指针，一开始都指向dummy
			ListNode slow = dummy;
			ListNode fast = dummy;
			// 快指针先走n+1步(所以这里必须是<=n,而不是<n)，目的是为了在块指针指向链表结尾null时，慢指针指向要删除的倒数节点的前一个节点，这样才好做节点的删除
			for (int i = 0; i <= n; i++) {
				fast = fast.next;
			}
			while (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
			slow.next = slow.next.next;
            return dummy.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
        }

        public ListNode() {
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
