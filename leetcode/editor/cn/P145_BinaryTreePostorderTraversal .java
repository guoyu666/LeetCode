/**
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[3,2,1]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = []
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 * <p>
 * Related Topics 栈 树 深度优先搜索 二叉树 👍 1187 👎 0
 */

package editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 * @author GuoYu
 * @date 2024-08-12 11:01:23
 */
class P145_BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P145_BinaryTreePostorderTraversal().new Solution();
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
		// 创建数组，用于存储结果
		List<Integer> res = new ArrayList<Integer>();
        public List<Integer> postorderTraversal(TreeNode root) {
			postorder(root);
			return res;
        }

		public void postorder(TreeNode root){
			if (root == null)
				return;
			postorder(root.left);
			postorder(root.right);
			res.add(root.val);
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
