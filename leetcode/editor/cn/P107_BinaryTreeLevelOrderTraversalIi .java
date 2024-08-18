/**
给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 

 

 示例 1： 
 
 
输入：root = [3,9,20,null,null,15,7]
输出：[[15,7],[9,20],[3]]
 

 示例 2： 

 
输入：root = [1]
输出：[[1]]
 

 示例 3： 

 
输入：root = []
输出：[]
 

 

 提示： 

 
 树中节点数目在范围 [0, 2000] 内 
 -1000 <= Node.val <= 1000 
 

 Related Topics 树 广度优先搜索 二叉树 👍 807 👎 0

*/

package editor.cn;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * 二叉树的层序遍历 II
 * @author GuoYu
 * @date 2024-08-14 23:45:49
 */
class P107_BinaryTreeLevelOrderTraversalIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P107_BinaryTreeLevelOrderTraversalIi().new Solution();
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		// 创建一个队列，用于存储节点
		Deque<TreeNode> queue = new LinkedList<>();
		// 创建一个结果列表，用于存储结果
		List<List<Integer>> res = new ArrayList<>();
		if (root != null) {
			queue.add(root);
		}
		while (!queue.isEmpty()){
			// 创建一个临时列表，用于存储当前层的节点值
			ArrayList<Integer> tmp = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				tmp.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			res.add(tmp);
		}
		// 结果列表需要反转，因为我们是从底层开始遍历的
		Collections.reverse(res);
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
