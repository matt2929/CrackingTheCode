package DataStructs;

public class NodeLevel {

    public TreeNode parent;
    public TreeNode self;
    int level;
    String attr;

    public NodeLevel(TreeNode parent, TreeNode self, int level, String attr) {
        this.parent = parent;
        this.self = self;
        this.level = level;
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    public TreeNode getParent() {
        return parent;
    }

    public TreeNode getSelf() {
        return self;
    }

    public int getLevel() {
        return level;
    }
}
