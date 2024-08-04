/**
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * <p>
 * 实现 MyStack 类：
 * <p>
 * <p>
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 注意：
 * <p>
 * <p>
 * 你只能使用队列的标准操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
 * 你所使用的语言也许不支持队列。 你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * <p>
 * 输入：
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * 输出：
 * [null, null, null, 2, 2, false]
 * <p>
 * 解释：
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // 返回 2
 * myStack.pop(); // 返回 2
 * myStack.empty(); // 返回 False
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= x <= 9
 * 最多调用100 次 push、pop、top 和 empty
 * 每次调用 pop 和 top 都保证栈不为空
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能否仅用一个队列来实现栈。
 * <p>
 * Related Topics 栈 设计 队列 👍 903 👎 0
 */

package editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 * @author GuoYu
 * @date 2024-08-05 01:02:35
 */
class P225_ImplementStackUsingQueues {
    public static void main(String[] args) {
        //测试代码
        MyStack solution = new P225_ImplementStackUsingQueues().new MyStack();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {
        // 单端队列
        private Queue<Integer> queue;
        public MyStack() {
            queue = new LinkedList<>(); // 因为通过源码查看可知，LinkedList继承了Deque接口，而Deque接口继承了Queue接口，因此queue可以直接使用LinkedList来实现
        }

        public void push(int x) {    // 压入栈顶元素
            queue.add(x);
        }

        public int pop() {  // 弹出栈顶元素
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.poll());    // 将队列中的前n-1个元素放入队列的末尾
            }
            return queue.poll();
        }

        public int top() {  // 返回栈顶元素
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.poll());
            }
            int top = queue.poll();
            queue.add(top);
            return top;
        }

        public boolean empty() {    // 判断栈是否为空
            return queue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
