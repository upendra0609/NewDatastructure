package com.sikku.tree;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
