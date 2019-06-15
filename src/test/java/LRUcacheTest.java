import DataStructs.DLList;

import DataStructs.DLNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUcacheTest {

    @Test
    public void testSolution(){
        DLList dlList = new DLList(2);
        DLNode luck97 = null;
        for(int i=0;i<1000;i++){
            System.out.println("i: "+i);
            if(i==997) {
               luck97 = dlList.addFirst(i);
            }else {
                dlList.addFirst(i);
            }
        }

        //dlList.upgradeNode(luck97);

        assertEquals(dlList.makeString()+"\n"+dlList.getHead().getKey()+":"+dlList.getTail().getKey(),"void");
    }

}
