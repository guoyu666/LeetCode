/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = []
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：head = [1]
 * 输出：[1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 * <p>
 * <p>
 * Related Topics 递归 链表 👍 2237 👎 0
 */
package editor.cn;

//java:两两交换链表中的节点
class P24SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new P24SwapNodesInPairs().new Solution();
    }
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
        public ListNode swapPairs(ListNode head) {
            // 创建一个新的虚拟头节点
            ListNode dummy = new ListNode();
            // 虚拟头节点的下一个节点指向原链表的头节点
            dummy.next = head;
            // 创建一个指向虚拟头节点的指针
            ListNode current = dummy;
            while (current.next != null && current.next.next != null) {
                ListNode temp = current.next; // 保存当前节点的下一个节点（即保存原始的头节点）
                current.next = current.next.next;

            }
            return dummy.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
// 单向链表定义
    public class ListNode {
        int val;
        ListNode next;

        // 无参数构造函数
        ListNode() {
        }

        // 节点中存储的值
        ListNode(int val) {
            this.val = val;
        }

        // 有参构造函数
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
