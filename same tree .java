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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int demo=0;
            if(p==null && q==null){
            return true;
        }
        if(p==null ||q==null){
            return false;
        }
        demo=1;
            return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
}
