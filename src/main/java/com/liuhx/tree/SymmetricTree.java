package com.liuhx.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTwo(root.left, root.right);
    }

    public boolean isSymmetricTwo(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return isSymmetricTwo(left.left, right.right) && isSymmetricTwo(left.right, right.left);
        } else {
            return false;
        }
    }

    public boolean isSymmetric2(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(left);
        queue.add(right);
        while(!queue.isEmpty()){
            TreeNode a = queue.poll();
            TreeNode b = queue.poll();
            if(a==null&&b==null){
                continue;
            }
            if(a ==null||b ==null){
                return false;
            }
            if(a.val!=b.val){
                return false;
            }
            queue.add(a.left);
            queue.add(b.right);
            queue.add(a.right);
            queue.add(b.left);
        }
        return true;
    }
}
