/**
给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 

 

 示例 1： 
 
 
输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]
 

 示例 2： 

 
输入：head = [1], n = 1
输出：[]
 

 示例 3： 

 
输入：head = [1,2], n = 1
输出：[1]
 

 

 提示： 

 
 链表中结点的数目为 sz 
 1 <= sz <= 30 
 0 <= Node.val <= 100 
 1 <= n <= sz 
 

 

 进阶：你能尝试使用一趟扫描实现吗？ 

 Related Topics 链表 双指针 👍 2893 👎 0

*/
package editor.cn;
//java:删除链表的倒数第 N 个结点
class P19RemoveNthNodeFromEndOfList{
    public static void main(String[] args){
        Solution solution = new P19RemoveNthNodeFromEndOfList().new Solution();
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 创建虚拟头节点
        ListNode dummy = new ListNode();
        // 让虚拟头节点指向原链表的头节点head
        dummy.next = head;
        // 定义快慢指针
        ListNode fast = dummy;
        ListNode slow = dummy;
        // 快指针先走n+1步，目的是为了在快指针指向链表结尾null时，慢指针指向要删除的倒数节点的前一个节点，这样才好做节点的删除
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // 快慢指针一起走，直到快指针到达链表结尾null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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
