package com.liuhx.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.liuhx.tree.Solution.TreeNode;

public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> integerList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Boolean isLeft = true;
        while (!queue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<Integer>();
            int i = queue.size();
            while (i>0) {
                TreeNode treeNode = queue.poll();
                if(isLeft){
                    levelList.addFirst(treeNode.val);
                }else{
                    levelList.addLast(treeNode.val);
                }
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                i--;
            }
            isLeft = !isLeft;
            integerList.add(new ArrayList<>(levelList));
        }
        return integerList;
    }
}
