package Problems;

import DataStructs.TreeNode;

import java.util.ArrayList;

public class TreeProblem {

    public ArrayList<String> preOrderTraversal(TreeNode treeNode) {
        ArrayList<String> out = new ArrayList<>();
        preOrderTraversal(out, treeNode);
        return out;
    }

    private void preOrderTraversal(ArrayList<String> nodes, TreeNode treeNode) {
        if (treeNode != null) {
            nodes.add(treeNode.getValue());
            preOrderTraversal(nodes, treeNode.getLeft());
            preOrderTraversal(nodes, treeNode.getRight());
        }
    }

    public ArrayList<String> inOrderTraversal(TreeNode treeNode) {
        ArrayList<String> out = new ArrayList<>();
        inOrderTraversal(out, treeNode);
        return out;
    }

    private void inOrderTraversal(ArrayList<String> nodes, TreeNode treeNode) {
        if (treeNode != null) {
            inOrderTraversal(nodes, treeNode.getLeft());
            nodes.add(treeNode.getValue());
            inOrderTraversal(nodes, treeNode.getRight());
        }
    }

    public ArrayList<String> postOrderTraversal(TreeNode treeNode) {
        ArrayList<String> out = new ArrayList<>();
        postOrderTraversal(out, treeNode);
        return out;
    }

    private void postOrderTraversal(ArrayList<String> nodes, TreeNode treeNode) {
        if (treeNode != null) {
            postOrderTraversal(nodes, treeNode.getLeft());
            postOrderTraversal(nodes, treeNode.getRight());
            nodes.add(treeNode.getValue());
        }
    }

}
