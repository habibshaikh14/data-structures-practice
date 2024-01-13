package leetcode;

import leetcode.helper.classes.BinaryTree;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class InorderTreeTraversal {
    public static void main(String[] args) {
        var tree = new BinaryTree(1, new BinaryTree(2, new BinaryTree(3), null),
                new BinaryTree(5, null, new BinaryTree(7)));
        out.println(inorderTraversal(tree));
    }

    public static List<Integer> inorderTraversal(BinaryTree root) {
        var list = new LinkedList<Integer>();
        if (root != null) {
            list.addAll(inorderTraversal(root.getLeft()));
            list.add(root.getVal());
            list.addAll(inorderTraversal(root.getRight()));
        }
        return list;
    }
}
