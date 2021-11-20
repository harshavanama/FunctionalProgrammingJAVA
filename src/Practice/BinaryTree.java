//package Practice;
//
//import javax.swing.tree.TreeNode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BinaryTree {
//    public static void main(String[] args) {
//        List<Integer> integers = inorderTraversal();
//    }
//
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//
//    public static List < Integer > inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//
//        public static void helper(TreeNode root, List<Integer> res) {
//            if (root != null) {
//                if (root.left != null) {
//                    helper(root.left, res);
//                }
//                res.add(root.val);
//                if (root.right != null) {
//                    helper(root.right, res);
//                }
//            }
//        }
//    }
