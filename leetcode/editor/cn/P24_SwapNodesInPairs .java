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
 * Related Topics 递归 链表 👍 2244 👎 0
 */

package editor.cn;

import java.util.List;

/**
 * 两两交换链表中的节点
 * @author GuoYu
 * @date 2024-07-26 10:09:45
 */
class P24_SwapNodesInPairs {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P24_SwapNodesInPairs().new Solution();
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
        public ListNode swapPairs(ListNode head) {
            // 创建一个虚拟头节点，虚拟头节点的下一个节点为原链表的头节点
            ListNode dummy = new ListNode();
			dummy.next = head;
			// 定义一个指针，指向当前虚拟头节点
			ListNode current = dummy;
			while (current.next != null && current.next.next!= null){
				ListNode temp1 = current.next;
				ListNode temp2 = current.next.next.next;
				current.next = temp1.next;
				temp1.next.next = temp1;
				temp1.next = temp2;
				// 移动current指针到temp1
				current = temp1;
			}
			return dummy.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
