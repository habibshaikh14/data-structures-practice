package leetcode;

import leetcode.helper.classes.TreeNode;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class InorderTreeTraversal {
    public static void main(String[] args) {
        var tree = new TreeNode(1, new TreeNode(2, new TreeNode(3), null),
                new TreeNode(5, null, new TreeNode(7)));
        out.println(inorderTraversal(tree));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        var list = new LinkedList<Integer>();
        if (root != null) {
            list.addAll(inorderTraversal(root.getLeft()));
            list.add(root.getVal());
            list.addAll(inorderTraversal(root.getRight()));
        }
        return list;
    }
}
