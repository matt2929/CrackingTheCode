import DataStructs.TreeNode;
import Problems.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Tests3 {

    Tree tree = new Tree();

    @Test
    public void PreOrderTraversal() {
        TreeNode tree = new TreeNode("10");
        tree.setLeft(new TreeNode("5"));
        tree.setRight(new TreeNode("20"));
        tree.getRight().setLeft(new TreeNode("3"));
        tree.getRight().setRight(new TreeNode("7"));
        tree.getRight().getLeft().setLeft(new TreeNode("9"));
        tree.getRight().getLeft().setRight(new TreeNode("18"));

        assertEquals(this.tree.preOrderTraversal(tree), new ArrayList<String>(Arrays.asList(new String[]{"10","5","20","3","9","18","7"})));
    }

    @Test
    public void InOrderTraversal() {
        TreeNode tree = new TreeNode("10");
        tree.setLeft(new TreeNode("5"));
        tree.setRight(new TreeNode("20"));
        tree.getRight().setLeft(new TreeNode("3"));
        tree.getRight().setRight(new TreeNode("7"));
        tree.getRight().getLeft().setLeft(new TreeNode("9"));
        tree.getRight().getLeft().setRight(new TreeNode("18"));

        assertEquals(this.tree.inOrderTraversal(tree), new ArrayList<String>(Arrays.asList(new String[]{"5","10","9","3","18","20","7"})));

    }

    @Test
    public void PostOrderTraversal() {
        TreeNode tree = new TreeNode("10");
        tree.setLeft(new TreeNode("5"));
        tree.setRight(new TreeNode("20"));
        tree.getRight().setLeft(new TreeNode("3"));
        tree.getRight().setRight(new TreeNode("7"));
        tree.getRight().getLeft().setLeft(new TreeNode("9"));
        tree.getRight().getLeft().setRight(new TreeNode("18"));

        assertEquals(this.tree.postOrderTraversal(tree), new ArrayList<String>(Arrays.asList(new String[]{"5","9","18","3","7","20","10"})));

    }

}
