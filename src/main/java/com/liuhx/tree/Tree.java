package com.liuhx.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public class TreeNode<T> {
        TreeNode<T> left;
        TreeNode<T> right;
        T data;
    }

    public void preOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);

    }

    public void inOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public void postOrder(TreeNode<Integer> node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    public void levelOrder(TreeNode<Integer> node){
        if(node == null){
            return;
        }
        Queue<TreeNode<Integer>> levelNode = new LinkedList<TreeNode<Integer>>();
        levelNode.add(node);
        while(!levelNode.isEmpty()){
            TreeNode<Integer> m= levelNode.poll();
            if(m.left!= null){
                levelNode.offer(m.left);
            }
            if(m.right!= null){
                levelNode.offer(m.right);
            }
            System.out.println(m.data);
        }
    }
}
