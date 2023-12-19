package com.sikku.leetcodeBT.verticalTraversal;

import com.sikku.leetcodeBT.TreeNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class VerticalTraversal {
    public static void main(String[] args) {
        TreeSet<Group> l = new TreeSet<>();
        Group g2 = new Group();
        g2.setHor(1);
        g2.setVer(-1);
        Group g3 = new Group();
        g3.setHor(1);
        g3.setVer(1);
        Group g1 = new Group();
        g1.setHor(0);
        g1.setVer(0);
        Group g4 = new Group();
        g4.setHor(2);
        g4.setVer(-2);
        l.add(g4);
        l.add(g2);
        l.add(g1);

        l.add(g3);


        for (Group g: l){
            System.out.println(g);
        }

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        return null;
    }
}

@Data
class Group implements Comparable<Group> {
    int hor;
    int ver;


    @Override
    public int compareTo(Group o) {
        if(o.ver>this.ver){
            return 1;
        } else if (o.ver<this.ver) {
            return -1;
        }else {
            return 0;
        }
    }
}
