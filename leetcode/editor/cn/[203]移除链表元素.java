/**
给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。

 

 示例 1： 
 
 
输入：head = [1,2,6,3,4,5,6], val = 6
输出：[1,2,3,4,5]
 

 示例 2： 

 
输入：head = [], val = 1
输出：[]
 

 示例 3： 

 
输入：head = [7,7,7,7], val = 7
输出：[]
 

 

 提示： 

 
 列表中的节点数目在范围 [0, 10⁴] 内 
 1 <= Node.val <= 50 
 0 <= val <= 50 
 

 Related Topics 递归 链表 👍 1438 👎 0

*/
package editor.cn;
//java:移除链表元素
class P203RemoveLinkedListElements{
    public static void main(String[] args){
        Solution solution = new P203RemoveLinkedListElements().new Solution();
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
    public ListNode removeElements(ListNode head, int val) {
        // 创建一个新的虚拟头节点
        ListNode dummy = new ListNode();
        // 该虚拟头节点的下一个节点才是我们真正的头节点head
        dummy.next = head;
        // 定义一个指向该虚拟头节点的指针，目的是让该虚拟头节点不动，我们只移动这个指针就行
        // 要不然最后返回头节点的时候就找不到原来头节点的位置了
        ListNode current = dummy;
        while (current.next!= null){
            if (current.next.val == val){
                current.next = current.next.next;
            }
            else current = current.next;
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
        ListNode() {};
        // 节点中存储的值
        ListNode(int val) { this.val = val; }
        // 有参构造函数
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
