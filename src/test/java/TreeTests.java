import DataStructs.NodeLevel;
import DataStructs.TreeNode;
import Problems.TreeProblem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TreeTests {

    TreeProblem tree = new TreeProblem();

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

    @Test
    public void MinimalTree(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<11;i++){
            arrayList.add(i);
        }
        TreeProblem treeProblem=new TreeProblem();
        String out ="";
        for(NodeLevel nodeLevel:tree.preOrderTraversalLevel(treeProblem.minimumSpanningTree(arrayList).getLeft())){
            out+="P: "+nodeLevel.parent.getValue()+"->C: "+nodeLevel.self.getValue()+" attr: "+nodeLevel.getAttr() +" level: "+nodeLevel.getLevel()+"\n";
        }
        System.out.println("-----");

        System.out.println(out);
        System.out.println("-----");

        assertEquals("",out);


    }

    @Test
    public void ValidateBSTGood(){
        TreeNode tree = new TreeNode("20");
        tree.setLeft(new TreeNode("10"));
        tree.setRight(new TreeNode("30"));
        tree.getLeft().setLeft(new TreeNode("5"));
        tree.getLeft().setRight(new TreeNode("15"));
        tree.getLeft().getLeft().setLeft(new TreeNode("3"));
        tree.getLeft().getLeft().setRight(new TreeNode("7"));
        tree.getLeft().getRight().setRight(new TreeNode("17"));
        TreeProblem treeProblem= new TreeProblem();
        assertEquals(true, treeProblem.bstValidate(tree));
    }

    @Test
    public void ValidateBSTBad(){
        TreeNode tree = new TreeNode("20");
        tree.setLeft(new TreeNode("10"));
        tree.setRight(new TreeNode("30"));
        tree.getLeft().setLeft(new TreeNode("500"));
        tree.getLeft().setRight(new TreeNode("15"));
        tree.getLeft().getLeft().setLeft(new TreeNode("3"));
        tree.getLeft().getLeft().setRight(new TreeNode("7"));
        tree.getLeft().getRight().setRight(new TreeNode("17"));
        TreeProblem treeProblem= new TreeProblem();
        assertEquals(false, treeProblem.bstValidate(tree));
    }

}
