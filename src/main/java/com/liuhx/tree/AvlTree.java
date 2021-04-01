package com.liuhx.tree;

import java.util.concurrent.locks.ReadWriteLock;

public class AvlTree<T extends Comparable<T>> {
    public class AvlTreeNode {
        public T data;
        public AvlTreeNode left;
        public AvlTreeNode right;
        public int height;

        public AvlTreeNode(T data) {
            this.data = data;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }

    private AvlTreeNode root;
    private int size;

    public AvlTree() {
        this.root = null;
        this.size = 0;
    }

    private int getHeight(AvlTreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 获取节点的平衡因子
     * 
     * @param node
     * @return
     */

    private int getBalanceFactor(AvlTreeNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    public boolean isBalance() {
        return isBalance(root);
    }

    private boolean isBalance(AvlTreeNode node) {
        if (node == null) {
            return true;
        }
        int balanceFactor = Math.abs(getBalanceFactor(node));
        if (balanceFactor > 1)
            return false;
        return isBalance(node.left) && isBalance(node.right);
    }

    /**
     * 右旋转
     */
    private AvlTreeNode rightRotate(AvlTreeNode y) {
        AvlTreeNode x = y.left;
        y.left = x.right;
        x.right = y;
        y.height = Math.max(getHeight(y.left), getHeight(y.right));
        x.height = Math.max(getHeight(x.left), getHeight(x.right));
        return x;
    }

    /**
     * 左旋转
     */
    private AvlTreeNode leftRotate(AvlTreeNode x) {
        AvlTreeNode y = x.right;
        x.right = y.left;
        y.left = x;
        y.height = Math.max(getHeight(y.left), getHeight(y.right));
        x.height = Math.max(getHeight(x.left), getHeight(x.right));
        return y;
    }

    public void add(T data) {
        root = add(root, data);
    }

    private AvlTreeNode add(AvlTreeNode node, T data) {
        if (node == null) {
            size++;
            return new AvlTreeNode(data);
        }
        if (data.compareTo(node.data) > 0) {
            node.right = add(node.right, data);
        } else if (data.compareTo(node.data) < 0) {
            node.left = add(node.left, data);
        }
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        return toBalance(node);
    }
    private AvlTreeNode remove(AvlTreeNode node,T data) {
        if(node == null) return null;
        if(data.compareTo(node.data)> 0){
            node.right = remove(node.right, data);
        }else if(data.compareTo(node.data)<0){
            node.left = remove(node.left, data);
        }else{
        }
        return node;
    }
    private AvlTreeNode toBalance(AvlTreeNode node) {
        int balanceFactor = getBalanceFactor(node);
        if (balanceFactor > 1 && getBalanceFactor(node.left) > 0) {
            return rightRotate(node);
        }
        if (balanceFactor < -1 && getBalanceFactor(node.right) < 0) {
            return leftRotate(node);
        }
        if (balanceFactor > 1 && getBalanceFactor(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balanceFactor < -1 && getBalanceFactor(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
}
