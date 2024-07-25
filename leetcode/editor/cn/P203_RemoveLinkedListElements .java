/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [], val = 1
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 列表中的节点数目在范围 [0, 10⁴] 内
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 * <p>
 * <p>
 * Related Topics 递归 链表 👍 1445 👎 0
 */

package editor.cn;

/**
 * 移除链表元素
 *
 * @author GuoYu
 * @date 2024-07-26 01:48:30
 */
class P203_RemoveLinkedListElements {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P203_RemoveLinkedListElements().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            // 创建一个新的虚拟头节点
            ListNode dummy = new ListNode();
            // 让虚拟头节点的下一个节点指向头节点
            dummy.next = head;
            // 定义一个指针，指向虚拟头节点
            ListNode current = dummy;
            while (current.next != null) {
                if (current.next.val == val) {
                    current.next = current.next.next;
                }
                else
                    current = current.next;
            }
            return dummy.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class ListNode {

        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }
}
