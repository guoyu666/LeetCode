/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[9,20],[15,7]]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1]
 * 输出：[[1]]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：root = []
 * 输出：[]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点数目在范围 [0, 2000] 内
 * -1000 <= Node.val <= 1000
 * <p>
 * <p>
 * Related Topics 树 广度优先搜索 二叉树 👍 2002 👎 0
 */

package editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 * @author GuoYu
 * @date 2024-08-12 11:26:25
 */
public class P102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P102_BinaryTreeLevelOrderTraversal().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            // 创建队列，用于存储节点
			Queue<TreeNode> queue = new  LinkedList<>();
			// 创建列表，用于存储最后的结果
			List<List<Integer>> res = new ArrayList<>();
			if (root != null)
				queue.add(root);
			while(!queue.isEmpty()){
                // 每次循环都会创建一个临时列表，用于存储当前层的打印结果
                List<Integer> tmp = new ArrayList<>();
                for (int i = queue.size(); i > 0; i--){
                    // 队首元素出队，将其值添加到临时列表中的尾部
                    TreeNode node = queue.poll();
                    tmp.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
                res.add(tmp);
            }
            return res;
		}
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
