package Problems;

import DataStructs.Node;
import DataStructs.NodeLevel;
import DataStructs.TreeNode;

import java.util.ArrayList;

public class TreeProblem {

    public ArrayList<NodeLevel> preOrderTraversalLevel(TreeNode treeNode) {
        ArrayList<NodeLevel> out = new ArrayList<>();
        preOrderTraversalLevel(out, treeNode,treeNode,0, "HEAD");
        return out;
    }

    private void preOrderTraversalLevel(ArrayList<NodeLevel> nodes, TreeNode parent,TreeNode treeNode,int level, String attrib) {
        if (treeNode != null) {
            nodes.add(new NodeLevel(parent,treeNode,level,attrib));
            preOrderTraversalLevel(nodes,treeNode, treeNode.getLeft(),level+1,"left");
            preOrderTraversalLevel(nodes,treeNode, treeNode.getRight(),level+1,"right");
        }
    }


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

    public TreeNode minimumSpanningTree(ArrayList<Integer> values) {
        TreeNode start = new TreeNode("" + Integer.MAX_VALUE);
        minimumSpanningTreeHelper(values, 0, values.size()-1, start);
        return start;
    }

    private void minimumSpanningTreeHelper(ArrayList<Integer> values, int l, int r, TreeNode treeNode) {
        if (r<l) {
            return;
        }
        int mid = l + (r - l) / 2;
        TreeNode node = addTreeHelper(values.get(mid), treeNode);
        System.out.println("L: "+l + "R: "+r);
        minimumSpanningTreeHelper(values, l, mid-1, node);
        minimumSpanningTreeHelper(values, mid+1, r, node);
    }

    private TreeNode addTreeHelper(int value, TreeNode node) {
        if (value > Integer.parseInt(node.getValue())) {
            if (node.getRight() == null) {
                node.setRight(new TreeNode("" + value));
                return node.getRight();
            } else {
                return addTreeHelper(value, node.getRight());
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode("" + value));
                return node.getLeft();
            } else {
                return addTreeHelper(value, node.getLeft());
            }
        }
    }

    public boolean bstValidate(TreeNode root){
        if(root==null||root.getLeft()==null&&root.getRight()==null){return true;}

        if(root.getLeft()==null){
            return Integer.parseInt(root.getValue())<Integer.parseInt(root.getRight().getValue())
                    &&bstValidate(root.getRight());
        }else if(root.getRight()==null){
            return Integer.parseInt(root.getValue())>=Integer.parseInt(root.getLeft().getValue())
                    &&bstValidate(root.getLeft());
        }else{
            return Integer.parseInt(root.getValue())>=Integer.parseInt(root.getLeft().getValue())
                    &&bstValidate(root.getLeft())
                    &&Integer.parseInt(root.getValue())<Integer.parseInt(root.getRight().getValue())
                    &&bstValidate(root.getRight());
        }
    }



}
