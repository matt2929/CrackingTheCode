package DataStructs;

public class TreeNode {
    String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String str) {
        this.value = str;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }
}
