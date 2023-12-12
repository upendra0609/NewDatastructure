package com.sikku.binaryTrees;

public class BinaryTreeNode<T> {
    public T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
