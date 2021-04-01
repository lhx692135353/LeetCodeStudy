package com.liuhx.tree;

public class RBTree<T extends Comparable<T>> {
    private RBTNode<T> root;
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    public class RBTNode<T extends Comparable<T>> {
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;

        public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public T getKey() {
            return key;
        }
    }

    public RBTree() {
        this.root = null;
    }

    private RBTNode<T> parentOf(RBTNode<T> node) {
        return node != null ? node.parent : null;
    }

    private boolean colorOf(RBTNode<T> node) {
        return node != null ? node.color : BLACK;
    }

    private boolean isRed(RBTNode<T> node) {
        return ((node != null) && (node.color == RED)) ? true : false;
    }

    private boolean isBlack(RBTNode<T> node) {
        return !isRed(node);
    }

    private void setBlack(RBTNode<T> node) {
        if (node != null)
            node.color = BLACK;
    }

    private void setRed(RBTNode<T> node) {
        if (node != null)
            node.color = RED;
    }

    private void setParent(RBTNode<T> node, RBTNode<T> parent) {
        if (node != null)
            node.parent = parent;
    }

    private void setColor(RBTNode<T> node, boolean color) {
        if (node != null)
            node.color = color;
    }

    /*
     * (递归实现)查找"红黑树x"中键值为key的节点
     */
    private RBTNode<T> search(RBTNode<T> x, T key) {
        if (x == null)
            return null;
        int cmp = x.key.compareTo(key);
        if (cmp > 0) {
            search(x.left, key);
        } else if (cmp < 0) {
            search(x.right, key);
        } else if (cmp == 0) {
            return x;
        }
        return null;
    }

    public RBTNode<T> search(T key) {
        return this.search(this.root, key);
    }

    /*
     * 对红黑树的节点(x)进行左旋转
     *
     * 左旋示意图(对节点x进行左旋)： px px / / x y / \ --(左旋)-. / \ # lx y x ry / \ / \ ly ry lx
     * ly
     *
     *
     */
    private void leftRotate(RBTNode<T> x) {
        RBTNode<T> y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else {
            if (x.parent.left == x) {
                x.parent.left = y;
            } else {
                x.parent.right = y;
            }
        }
        y.left = x;
        x.parent = y;
    }
     /*
      * 对红黑树的节点(y)进行右旋转
      *
      * 右旋示意图(对节点y进行左旋)：
      *            py                               py
      *           /                                /
      *          y                                x                  
      *         /  \      --(右旋)-.            /  \                     #
      *        x   ry                           lx   y  
      *       / \                                   / \                   #
      *      lx  rx                                rx  ry
      * 
      */
      public void rightRotate(RBTNode<T> y){
        RBTNode<T> x = y.left;
        y.left = x.right;
        if(x.right!= null){
            x.right.parent = y;
        }
        x.parent = y.parent;
        if(y.parent==null){
            this.root = x;
        }else{
            if(y.parent.left==x){
                y.parent.left = x;
            }else{
                y.parent.right = x;
            }
        }
        x.right = y;
        y.parent = x;
      }
}
