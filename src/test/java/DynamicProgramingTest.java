

import Problems.DynamicProgramingProblem;
import org.junit.Test;

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

}
