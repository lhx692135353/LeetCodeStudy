package com.liuhx.tree.b_pluss_tree;

public class BPlusTree<T,V extends Comparable<V>> {
    

    abstract class Node<T, V extends Comparable<V>> {
        // 父节点
        protected Node<T, V> parent;
        // 子节点
        protected Node<T, V>[] childs;
        // 子节点个数
        protected Integer num;
        // 键
        protected Object keys[];
    
        public Node(int maxNum){
            this.keys = new Object[maxNum];
            this.childs = new Node[maxNum];
            this.num = 0;
        }
    
        abstract T find(V key);
    
        abstract Node<T,V> insert(T key, V value);

    }

    
}
