

import Problems.DynamicProgramingProblem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
public class DynamicProgramingTest {

    @Test
    public void allPermWithoutDups(){
        String cat ="cat";
        DynamicProgramingProblem dynamicProgramingProblem = new DynamicProgramingProblem();
        assertEquals(6,dynamicProgramingProblem.generatePerm(cat).size());
    }

    @Test
    public void allPermWithDups(){
        String cat ="caaaaaaaaaaaaaaaaaaaa";
        DynamicProgramingProblem dynamicProgramingProblem = new DynamicProgramingProblem();
        assertEquals(3,dynamicProgramingProblem.generatePermDup(cat).size());
    }

    @Test
    public void allPermParem(){
        DynamicProgramingProblem dynamicProgramingProblem = new DynamicProgramingProblem();
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"()()()","(())()","()(()),((())),(()())"}));
        assertEquals(arrayList,dynamicProgramingProblem.generateParem(3));
    }

    @Test
    public void allChangePerm(){
        DynamicProgramingProblem dynamicProgramingProblem = new DynamicProgramingProblem();
        assertEquals(new ArrayList<String>(), dynamicProgramingProblem.makeChange(new int[]{1,5,10},10));
    }

}
