/**
 * 给定一个链表的头节点 head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表
 * 中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * <p>
 * 不允许修改 链表。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：返回索引为 1 的链表节点
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [1,2], pos = 0
 * 输出：返回索引为 0 的链表节点
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [1], pos = -1
 * 输出：返回 null
 * 解释：链表中没有环。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中节点的数目范围在范围 [0, 10⁴] 内
 * -10⁵ <= Node.val <= 10⁵
 * pos 的值为 -1 或者链表中的一个有效索引
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你是否可以使用 O(1) 空间解决此题？
 * <p>
 * Related Topics 哈希表 链表 双指针 👍 2559 👎 0
 */
package editor.cn;

//java:环形链表 II
class P142LinkedListCycleIi {
    public static void main(String[] args) {
        Solution solution = new P142LinkedListCycleIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            // 定义快慢指针，一开始都指向头节点
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                // 快指针走两步，慢指针走一步
                slow = slow.next;
                fast = fast.next.next;
                // 如果快指针和慢指针相遇，则存在环
                if (slow == fast) {
                    ListNode index1 = fast;
                    ListNode index2 = head;
                    // 让两个指针同时移动
                    while (index1 != index2) {
                        index1 = index1.next;
                        index2 = index2.next;
                    }
                    return index1;
                }
            }
            return null;
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
